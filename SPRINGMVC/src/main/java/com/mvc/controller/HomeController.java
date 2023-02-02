package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("hello!!!!!!!");
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("you are welcome");
		return "about";
	}
}
