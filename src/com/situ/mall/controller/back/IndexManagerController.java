package com.situ.mall.controller.back;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/manager")
public class IndexManagerController {
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
