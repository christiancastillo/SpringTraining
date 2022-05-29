package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")
public class HolaController {
	@GetMapping("/home")
	public String home() {
		return "holaMundo"; //devuelve la VISTA "holaMundo.html"
	}
	
	@GetMapping("/") //se declara la raiz y se redirige al getmapping definido en la clase
	public RedirectView redireccionAHome(RedirectAttributes attributes) {
		attributes.addFlashAttribute("flashAtributo","");
		//attributes.addAttribute("atributo","home"); //aqui se define la redirección al map "home"
		return new RedirectView("home"); //aqui se define la redireccion hacia la ruta "/home"
	}
}
