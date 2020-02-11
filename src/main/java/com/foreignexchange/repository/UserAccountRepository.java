package com.foreignexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foreignexchange.entity.UserAccount;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long>{

}
