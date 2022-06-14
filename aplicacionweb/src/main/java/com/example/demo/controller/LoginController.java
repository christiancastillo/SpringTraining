package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Credenciales;

/*
 * Repaso: no redirige a /login.html
 * https://www.youtube.com/watch?v=15sit3XQNbY&list=PLz8JVd0sHx7p7bqv9kGANmpMaSw9tYoiv&index=14
 * */

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String redirectLogin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String login(Model model, @RequestParam(name="error")String error) {
		
		model.addAttribute("error", error);
		model.addAttribute("credenciales", new Credenciales());
		return "login";
	}
	
	@PostMapping("/check")
	public String check(@ModelAttribute(name="credenciales") Credenciales credenciales) {
		if(credenciales.getNombre().equals("paco") && credenciales.getPass().equals("234")) {
			return "users";
		} else {
			return "redirect:/login?error";
		}
	}
	
}
