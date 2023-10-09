package com.caio.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.course.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
   
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Caio","Caio@caio.com.br", "99999999", "12132131");
	     return ResponseEntity.ok().body(u);
	}
	
	
}
