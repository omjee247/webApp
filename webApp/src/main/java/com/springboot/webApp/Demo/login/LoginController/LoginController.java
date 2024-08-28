package com.springboot.webApp.Demo.login.LoginController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("Login-JSP")
	public String LoginJSP(@RequestParam String name, ModelMap model) {
		model.put("name", name);
		return "login";
	}
}
