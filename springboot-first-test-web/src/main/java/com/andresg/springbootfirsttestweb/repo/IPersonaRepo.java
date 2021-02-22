package com.andresg.springbootfirsttestweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andresg.springbootfirsttestweb.model.Persona;

public interface IPersonaRepo extends JpaRepository<Persona, Integer> {

}
