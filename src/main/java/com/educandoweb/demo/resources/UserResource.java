package com.educandoweb.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.demo.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	//Criando a funcao para acessar usuarios
	@GetMapping
	public ResponseEntity<User> findall(){
		User u = new User("Maria", "maria@gmail.com","999999","12345");
		return ResponseEntity.ok().body(u);
	}

}
