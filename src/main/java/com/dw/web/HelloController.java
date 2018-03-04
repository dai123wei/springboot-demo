package com.dw.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dw.tools.MyException;

@Controller
//@RestController
public class HelloController {

	/*@RequestMapping("/hello")
	public String test() throws Exception {
		//return "Hello World";
		//throw new Exception("发生错误");
		return "hello";
	}
	
	@RequestMapping("/json")
	public String json() throws MyException{
		throw new MyException("发生错误2");
	}
	*/
	
	@RequestMapping("/")
    public String index() {
        return "index1";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
	
}
