package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;

@Controller
@RequestMapping("/metodos") //Map raiz
public class MetodosController {
	//Metodo 1
	
	@RequestMapping(value="/metodoUno", method=RequestMethod.GET) //map despues de raiz
	//public String MetodoUno() {
	public String MetodoUno(Model modelo) { //Metodo para pasar datos desde java hacia la vista
		modelo.addAttribute("persona", new Persona("Christian Yamil", 771249235));
		return "vista_uno";
	}
	
	//Metodo dos
	@GetMapping("/metodoDos")
	public ModelAndView MetodoDos() {
		ModelAndView datos = new ModelAndView("vista_dos"); //se define la vista desde donde se hara binding
		datos.addObject("persona", new Persona("Aleida", 55112233));
		return new ModelAndView("vista_dos"); //retorna ModelAndView vista_dos.html
	}
}
