package in.dv.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.dv.main.entities.User;
import in.dv.main.services.UserService;

@Controller
public class UserContriller {
	
	
	
	@Autowired
	private UserService us;
	
	@GetMapping({"/" ,"/index"})
	public String openIndex() {
		return "index";
	}
	
	
	
	//login start	

	@GetMapping("/login")
	public String openLogin() {
		return "login";
	}
	
	@PostMapping("/Lform")
	public String handleLogin(@RequestParam("email") String email, @RequestParam("password") String password,Model model) {
		boolean status=us.loginUserService(email, password);
		
		if(status) {
			return "profile";
		}else {
			model.addAttribute("errorMsg","username and password are the wroung");
			return "login";
		}
	}
	
//	             register start
	
	@GetMapping("/register")
	public String openRegister(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/Rform")
	public String HandleRegisterForm(@ModelAttribute("user") User user, Model model) {
		boolean status=us.registerUserService(user);
		if(status) {
			model.addAttribute("sucessMsg","registrarion done");
			return"register";
		}else {
			model.addAttribute("failMsg","registrarion fail");
			return"error";
		}
	}
	
	//registration end
	
}
