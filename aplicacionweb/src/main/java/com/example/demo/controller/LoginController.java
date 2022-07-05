package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Credenciales;


@Controller
public class LoginController {
	
	@GetMapping("/") //Redirige al LOGIN
	public String redirectLogin() {
		return "redirect:/login";
	}
	
	@GetMapping("/login")
	public String login(Model model, @RequestParam(name="error")String error) {
		
		model.addAttribute("error", error);
		model.addAttribute("credenciales", new Credenciales());
		return "login"; //regresa login.html
	}
	
	@PostMapping("/check")
	public String check(@ModelAttribute(name="credenciales") Credenciales credenciales) {
		if(credenciales.getNombre().equals("paco") && credenciales.getPass().equals("234")) {
			return "users"; //regresa la vista users
		} else {
			return "redirect:/login"; //redirecciona al login para que se logee de nuevo, con parametro error
		}
	}
	
}
