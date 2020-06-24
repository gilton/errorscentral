package org.labs.babysteps.errorscentral.domain.service;

import java.util.List;

import org.labs.babysteps.errorscentral.domain.entity.User;
import org.labs.babysteps.errorscentral.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

}
