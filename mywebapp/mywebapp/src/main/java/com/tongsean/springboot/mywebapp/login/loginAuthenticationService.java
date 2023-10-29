package com.tongsean.springboot.mywebapp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class loginAuthenticationService {
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("sean");
		boolean isValidPassword = password.equalsIgnoreCase("123");
		return isValidPassword && isValidUserName;
	}
}
