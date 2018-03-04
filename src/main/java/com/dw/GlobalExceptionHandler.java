package com.dw;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dw.domain.ErrorInfo;
import com.dw.tools.MyException;

@ControllerAdvice
public class GlobalExceptionHandler {
	public static final String DEFAULT_ERROR_VIEW = "error";
	
	@ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {
        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("error");
        return mav;
    }
	
	@ExceptionHandler(value = MyException.class)
	@ResponseBody
	public ErrorInfo<String> jsonErrorHandler(HttpServletRequest request, Exception e){
		ErrorInfo<String> r = new ErrorInfo<String>();
		r.setMessage(e.getMessage());
		r.setCode(ErrorInfo.ERROR);
		r.setData("Some Data");
		r.setUrl(request.getRequestURI().toString());
		return r;
	}
	
}
