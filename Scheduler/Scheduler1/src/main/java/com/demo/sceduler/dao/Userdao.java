package com.demo.sceduler.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.sceduler.model.User;

@Repository
public interface Userdao extends JpaRepository<User, Integer> {

}
