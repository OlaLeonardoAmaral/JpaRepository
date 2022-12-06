package com.leonardo.stJparepository.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leonardo.stJparepository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
