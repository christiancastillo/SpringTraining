package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

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
		ModelAndView mav = new ModelAndView("vista_dos"); //se define la vista desde donde se hara binding
		mav.addObject("persona", new Persona("Aleida Torres", 55112233)); //se agrega la llave y la informacion que contiene dicha llave
		return mav; //retorna ModelAndView vista_dos.html
	}
	
	@GetMapping("/listaPersonas")
	public String MetodoTres(Model modelo) {
		modelo.addAttribute("p",getPersonas());
		return "lista_personas";
	}
	
	
	//Obtiene un listado de personas
	private List<Persona> getPersonas(){
		List<Persona> personaList = new ArrayList<>();
		personaList.add(new Persona("Christian Yamil Castillo C", 771214));
		personaList.add(new Persona("Aleida Torres Sanchez", 772736));
		personaList.add(new Persona("Dafne Castillo Torres",112233));
		personaList.add(new Persona("Lety Covarrubias Lopez", 7766222));
		personaList.add(new Persona("Fermin Castillo Gonzalez", 77112233));
		return personaList;				
	}
}
