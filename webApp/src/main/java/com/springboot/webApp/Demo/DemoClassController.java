package com.springboot.webApp.Demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoClassController {

	@ResponseBody
	@RequestMapping("hello")
	public String Hello() {
		return "Hello, What are you learning??";
	}
}
