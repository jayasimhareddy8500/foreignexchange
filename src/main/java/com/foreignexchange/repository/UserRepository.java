package com.foreignexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foreignexchange.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
