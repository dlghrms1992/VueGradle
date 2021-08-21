package com.hih.ruokey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {

	@RequestMapping("/asdsa")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/{path:[^\\.]*}")
	public String redirect() {
		return "forward";
	}
}
