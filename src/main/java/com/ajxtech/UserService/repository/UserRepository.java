package com.ajxtech.UserService.repository;

import com.ajxtech.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
