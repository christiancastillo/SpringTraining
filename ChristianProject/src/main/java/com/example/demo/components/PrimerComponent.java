package com.example.demo.components;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.example.demo.controller.LogController;

@Component("primerComponente") //Con esta anotacion se define el componente SPRING

public class PrimerComponent {
	private static final Log LOGGER = LogFactory.getLog(PrimerComponent.class);
	public void ejemploComponente() {
		LOGGER.info("ENTRANDO EN EL COMPONENTE");
	}
}
