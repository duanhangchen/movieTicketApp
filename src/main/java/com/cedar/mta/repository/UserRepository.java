package com.cedar.mta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cedar.mta.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
