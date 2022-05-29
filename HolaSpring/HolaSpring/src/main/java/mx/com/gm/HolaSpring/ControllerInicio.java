package mx.com.gm.HolaSpring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.HolaSpring.domain.Persona;

//@RestController

@Controller //Anotacion para Spring MVC 5553250505 
//5553250505 ext 0941
@Slf4j //LOGGING
public class ControllerInicio {
	
	@Value("${index.saludo}") //Obtiene el valor index.saludo desde el application.properties
	private String val;				
	
	@GetMapping("/") //Regresa cadena de la función, localhost:8080/ si se agrega algo es necesario cargar en el navegador
	public String inicio(Model model) {
		var persona = new Persona();
		var persona2 = new Persona();
		String msg = "Hola Mundo con Thymeleaf";
		
		persona.setNombre("Juan");
		persona.setApellido("Perez");
		persona.setEmail("jperez@mail.com");
		persona.setTelefono("5544332211");
		
		persona2.setNombre("Carla");
		persona2.setApellido("Gomez");
		persona2.setEmail("cgomezc@gmail.com");
		persona2.setTelefono("55123456");
		
		List<Persona> personas = Arrays.asList(persona, persona2);
		
		model.addAttribute("mensaje", msg); //se define llave y mensaje
		model.addAttribute("saludo", val);
		model.addAttribute("personaNombre",persona.getNombre());
		model.addAttribute("personaApellido",persona.getApellido());
		model.addAttribute("personaEmail",persona.getEmail());
		model.addAttribute("personaTelefono",persona.getTelefono());
		model.addAttribute("personas",personas);
		
		//carga HTML de src/main/resources		
		return "index"; //regresa un index.html de Thymeleaf (src/resources/templates)
		//
	}	
	
}
