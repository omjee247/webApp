package com.springboot.webApp.Demo.login.LoginController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springboot.webApp.Authentication.Authentication;


@Controller
public class LoginController {

	
//	private Logger logger = LoggerFactory.getLogger(getClass());
//	
//	@RequestMapping("Login-JSP")
//	public String LoginJSP(@RequestParam String name, ModelMap model) {
//		model.put("name", name);
//		
//		logger.debug("Request param is {}",name);
//		logger.info("I want this printed at info level");
//		logger.warn("I want this printed at warn level");
//		
//		return "login";		
//	}
	
	//private Authentication authentication = new Authentication();  //we can directly coupling with Authentication() but we are using spring boot so try to autowiring using like constructor injection
	
	
	private Authentication authentication;
	
	public LoginController(Authentication authentication) {
	super();
	this.authentication = authentication;
}
	@RequestMapping(value = "Login", method = RequestMethod.GET)
	public String LoginJSP() {
		return "login";
	}
	
	@RequestMapping(value = "Login", method = RequestMethod.POST)
	public String Welcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if(authentication.Authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		
		model.put("errorCredential", "Invalid credentials please try again");
		
		return "login";

	}
	
}
