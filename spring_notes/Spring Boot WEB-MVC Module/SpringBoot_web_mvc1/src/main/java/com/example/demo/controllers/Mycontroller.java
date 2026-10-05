package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {
	@PostMapping("/submitform")
	public String handle(@RequestParam("name1") String name, Model model) {
		System.out.println("name is " + name);
		model.addAttribute("model_name" ,name);
		return "profile";
		
	}
	

}
