package com.hih.ruokey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {

	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/{path:[^\\.]*}")
	public String redirect() {
		return "forward";
	}
}
