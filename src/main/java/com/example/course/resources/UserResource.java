package com.example.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController							//Recurso Web implementado por um controlador Rest
@RequestMapping(value = "/users")		//Nome do recurso
public class UserResource {
	
	@GetMapping //Indica que metodo responde Get do http
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "123456");
		return ResponseEntity.ok().body(u);
	}

}
