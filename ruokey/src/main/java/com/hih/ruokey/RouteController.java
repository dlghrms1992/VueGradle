package com.hih.ruokey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RouteController {

	@GetMapping({"/","/error"})
	public String index() {
		
		return "index";
	}
	
	/*
	 * @RequestMapping("/{path:[^\\.]*}") public String redirect() { return
	 * "forward"; }
	 */
}
