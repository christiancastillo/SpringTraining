package com.example.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.components.PrimerComponent;

/*
 * Clase para realizar LOGS.
 * 
 * 
 * */


@Controller
@RequestMapping("/loggers") //se le agrega la barra para que ingrese a la clase
public class LogController {
	//https://www.youtube.com/watch?v=cGvksc7Fqsg&list=PLz8JVd0sHx7p7bqv9kGANmpMaSw9tYoiv&index=9
	@Autowired
	@Qualifier("primerComponente")
	
	private PrimerComponent primerComponente;
	private static final Log LOG = LogFactory.getLog(LogController.class);
	
	@GetMapping("/metodo1")
	public String metodo1() {
		LOG.info("Estamos entrando en el metodo 1.");
		primerComponente.ejemploComponente();
		return "view1";
	}
	
	@GetMapping("/metodo2")
	public String metodo2() {
		LOG.info("Entrando al método 2!");
		return "view2";
	}
}
