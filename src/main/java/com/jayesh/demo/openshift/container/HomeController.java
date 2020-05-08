package com.jayesh.demo.openshift.container;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String welcomeMsg() {
		return "Welcome Sneha Darling...!!!";
	}
}
