package io.javagains.springbootstarter.hello;

import javax.ws.rs.GET;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GET
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}
	

}
