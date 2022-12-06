package com.leonardo.stJparepository.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardo.stJparepository.entities.User;
import com.leonardo.stJparepository.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired // Inject dependency
	private UserRepository repository;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> result = repository.findAll();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/page")
	public ResponseEntity<Page<User>> findAll(Pageable pageable) {
		Page<User> result = repository.findAll(pageable);
		return ResponseEntity.ok(result);
	}
}
