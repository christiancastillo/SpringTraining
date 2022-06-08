package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.UsuarioService;

@Controller
@RequestMapping("/user")
public class UsuarioController {
	
	//https://www.youtube.com/watch?v=ggYzgFYge-c&list=PLz8JVd0sHx7p7bqv9kGANmpMaSw9tYoiv&index=12
	//17:12
	
	@Autowired
	@Qualifier("usuarioservice") //nombre del bean
	private UsuarioService usuarioService;
	
	@GetMapping("/list")
	public ModelAndView listAllUsers() {
		return new ModelAndView("list").addObject("usuarios",usuarioService.listAllUsers());
	}
}
