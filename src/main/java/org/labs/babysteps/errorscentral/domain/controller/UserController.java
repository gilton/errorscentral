package org.labs.babysteps.errorscentral.domain.controller;

import java.util.List;

import org.labs.babysteps.errorscentral.domain.entity.User;
import org.labs.babysteps.errorscentral.domain.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class UserController {
	
	private UserService service;
	
	@GetMapping("/user")
	public List<User> getAll(){
		return service.getAllUsers();
	}
}
