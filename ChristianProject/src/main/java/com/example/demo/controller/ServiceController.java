package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.service.PrimerService;

@Controller
@RequestMapping("/controller")
public class ServiceController {
	@Autowired
	@Qualifier("primerservice")
	private PrimerService primerService;
	
	
	@GetMapping("/listado-personas")
	public String listadoPersonas(Model model) {
		model.addAttribute("p", primerService.getListadoPersonas());
		return "listado";
	}
}
