package com.hih.ruokey;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest 
@AutoConfigureMockMvc
public class HelloControllerTest {

	@Autowired
	private MockMvc mvc;
	
	@Test
	public void getHello() throws Exception {
		mvc.perform(ockMvcRequestBuilders.get("/hello")
										  .accept(MediaType.APPLICATION_JSON))
										  .andExpect(status().isOk()) 
										  .andExpect(content().string(equalTo("it will cause failure")));
	}
	
}
