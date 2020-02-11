package com.foreignexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foreignexchange.entity.UserTransaction;

public interface UserTransactionRepository extends JpaRepository<UserTransaction, Integer>{

}
