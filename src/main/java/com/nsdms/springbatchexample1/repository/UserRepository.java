package com.nsdms.springbatchexample1.repository;

import com.nsdms.springbatchexample1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
