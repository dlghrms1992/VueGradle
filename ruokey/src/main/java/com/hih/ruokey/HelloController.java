package com.hih.ruokey;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class HelloController {
 
  @RequestMapping("/api/hello") 
  public String index() { return "hello"; }
 
}
