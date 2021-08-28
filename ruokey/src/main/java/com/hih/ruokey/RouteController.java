package com.hih.ruokey;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Slf4j
@Controller
public class RouteController {

	@GetMapping({"/index","/error"})
	public String index() {
		
		return "index";
	}
	
	/*
	 * @RequestMapping("/{path:[^\\.]*}") public String redirect() { return
	 * "forward"; }
	 */
}
