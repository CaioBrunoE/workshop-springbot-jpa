package com.caio.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caio.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
}
