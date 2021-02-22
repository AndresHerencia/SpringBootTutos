package com.andresg.democonsola;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.andresg.democonsola.service.IPersonaService;
import com.andresg.democonsola.service.PersonaServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		//System.out.println("Desde Spring Boot en Consola");
		//LOG.info("Desde Spring Boot en Consola Info");
		//LOG.warn("Desde Spring Boot en Consola Warining");
		//service = new PersonaServiceImpl();
		service.registrar("AndresG");
	}
}