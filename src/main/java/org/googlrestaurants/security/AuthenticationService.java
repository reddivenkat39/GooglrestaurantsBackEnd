package org.googlrestaurants.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthenticationService {

	@RequestMapping("/authentication")
	public String authentication(Model m){
		return "authentication";
	}
}
