package com.andresg.springbootfirsttestweb.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andresg.springbootfirsttestweb.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {
	
	Usuario findByNombre(String nombre);

}
