package com.andresg.springbootfirsttestweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.andresg.springbootfirsttestweb.model.Persona;
import com.andresg.springbootfirsttestweb.repo.IPersonaRepo;

@Controller
public class DemoController {
	
	@Autowired
	private IPersonaRepo repo;
	
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		//logica
		Persona p = new Persona();
		p.setIdPersona(3);
		p.setNombre(name);
		repo.save(p);
		
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("personas", repo.findAll());
		return "greeting";
	}
	
}
