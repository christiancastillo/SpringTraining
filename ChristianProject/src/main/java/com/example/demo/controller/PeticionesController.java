package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class PeticionesController {

	//URL: https://www.youtube.com/watch?v=DBoqqWHmKKk&list=PLz8JVd0sHx7p7bqv9kGANmpMaSw9tYoiv&index=6
	//localhost:8080/peticiones1?nombre=María
	@GetMapping("/peticiones1")
	public ModelAndView peticiones(@RequestParam(name="nombre") String _nombre) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("nombre",_nombre);
		return mav;				
	}
	
	//localhost:8080/peticiones1/María
	
	@GetMapping("/peticiones2/{nombre}")
	public ModelAndView peticionesDos(@PathVariable(name="nombre") String _nombre) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("nombre", _nombre);
		return mav;
	}
}
