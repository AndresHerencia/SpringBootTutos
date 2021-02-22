package com.andresg.democonsola.repository;

import com.andresg.democonsola.DemoConsolaApplication;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;

@Repository
@Qualifier("persona1")
public class PersonaRepoImpl1 implements IPersonaRepo {
	
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {
		LOG.info("SE REGISTRO A: " + nombre);
		
	}
	

}
