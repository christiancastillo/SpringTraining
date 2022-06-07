package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/ejemploPost")
public class PostController {
	
	//Forma para hacer REDIRECCION #1:
	
	@GetMapping("/")
	public String redirect1() {
		return "redirect:/ejemploPost/form";
	}
	
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("persona", new Persona());
		return "formulario";
	}
	
	@PostMapping("/addPersona") //se pone el método de th:action del formulario 
	public ModelAndView resultados(@ModelAttribute("persona") Persona persona) {
		//return new ModelAndView("resultados").addObject("persona", persona);
		ModelAndView mav = new ModelAndView("resultados");
		mav.addObject("persona", persona);
		return mav;
		
		
	}
}
