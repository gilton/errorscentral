package org.labs.babysteps.errorscentral.domain.repository;

import org.labs.babysteps.errorscentral.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByLogin(String login);
	
}
