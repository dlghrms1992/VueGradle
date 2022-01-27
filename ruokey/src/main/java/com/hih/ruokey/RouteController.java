package com.hih.ruokey;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class RouteController {
	
	@GetMapping({"/index","/error"})
	public String index() {
		log.debug("index~!!!!!!!!!!!!!!!!!!!!");
		
		return "index";
	}
	
	/*
	 * @RequestMapping("/{path:[^\\.]*}") public String redirect() { return
	 * "forward"; }
	 */
}
