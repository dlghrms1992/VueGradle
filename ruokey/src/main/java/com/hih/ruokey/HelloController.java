package com.hih.ruokey;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
 
  @RequestMapping("/hello") 
  public String index() { return "Hello Spring boot!"; }
 
}
