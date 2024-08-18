package com.springboot.webApp.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClassController {

	@RequestMapping("hello")
	public String Hello() {
		return "Hello, What are you learning??";
	}
}
