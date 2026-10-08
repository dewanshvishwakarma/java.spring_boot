package in.dv.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import in.dv.main.entities.user;
import in.dv.main.service.userService;

@Controller
public class UserController {
	@Autowired
	private userService userservice;
	
	@GetMapping({"/","/index"})
	public String openIndex() {
		return "index";
	}
	
	@GetMapping("/login")
	public String openLogin() {
		return "login";
	}
	
	@GetMapping("/register")
	public String OpenRegister(Model model) {
		model.addAttribute("user", new user());
		return "register";
	}
	
	@PostMapping("/rform")
	public String HandleRegistrationForm(@ModelAttribute("user") user uu,Model model) {
		boolean status= userservice.registrationUserService(uu);
		if(status) {
			model.addAttribute("sucess","regidtration done");
			return"register";
		}else {
			model.addAttribute("fail","failure");
			return "error";
		}
	}
}
