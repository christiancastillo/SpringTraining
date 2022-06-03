package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/ejemploPost")
public class PostController {
	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("persona", new Persona());
		return "formulario";
	}
}
