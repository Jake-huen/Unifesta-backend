package com.wit.unifesta.data.repository;

import com.wit.unifesta.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}