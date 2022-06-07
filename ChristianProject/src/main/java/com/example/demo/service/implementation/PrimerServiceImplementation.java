package com.example.demo.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.service.PrimerService;

@Service("primerservice") //Arrancara esta clase como "bean" en la confguracion de arranque
public class PrimerServiceImplementation implements PrimerService{

	@Override
	public List<Persona> getListadoPersonas() {
		List<Persona> p = new ArrayList<>();
		p.add(new Persona("Fermin Castillo", 1791));
		p.add(new Persona("Dafne Castillo", 0001));
		p.add(new Persona("Ale Torres", 1736));
		p.add(new Persona("Yamil Castillo", 9235));
		return p;
	}
	
	//Siguiente tema: https://www.youtube.com/watch?v=QAICUGrR1yg&list=PLz8JVd0sHx7p7bqv9kGANmpMaSw9tYoiv&index=11

}
