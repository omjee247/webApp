package com.springboot.webApp.Demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClassController {

	@RequestMapping("hello")
	public String Hello() {
		return "Hello, What are you learning??";
	}
	
	@RequestMapping("say-hello-html")
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My first HTML Page</title>");
		sb.append("<body>");
		sb.append("My first html page with body");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}
	
}
