package com.demo.sceduler.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.demo.sceduler.dao.Userdao;
import com.demo.sceduler.model.User;

@Service
public class UserService {

	@Autowired
	private Userdao userdao;

	@Scheduled(fixedRate = 5000)
	public void add2DB() {

		User user = new User();
		user.setName("user" + new Random().nextInt(1234));
		userdao.save(user);
		System.out.println("User" + new Date().toString());

	}

	@Scheduled(cron = "0/15 * * * * * ")
	public void fetchFromDB() {

		List<User> findAllUser = userdao.findAll();
		System.out.println("User" + new Date().toString());
		System.out.println("USERS" + findAllUser);
		System.out.println("USERS LIST SIZE"+findAllUser.size());

	}

}
