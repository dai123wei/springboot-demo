package com.dw.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TymController {

	@RequestMapping("/host")
	public String test(ModelMap map) {
		// 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.dai23wei.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
	}
}
