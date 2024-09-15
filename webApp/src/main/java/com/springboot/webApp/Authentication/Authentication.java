package com.springboot.webApp.Authentication;

import org.springframework.stereotype.Service;

@Service
public class Authentication {

	public boolean Authenticate(String userName, String password ) {
		
		boolean isUserNameValid = userName.equalsIgnoreCase("omjee");
		boolean isPassword = password.equalsIgnoreCase("check");
		return isUserNameValid && isPassword;
	}

	
}
