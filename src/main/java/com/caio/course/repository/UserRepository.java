package com.caio.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
