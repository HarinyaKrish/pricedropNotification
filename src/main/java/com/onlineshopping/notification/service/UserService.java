package com.onlineshopping.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineshopping.notification.model.User;
import com.onlineshopping.notification.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository alertrepo;

	public List<User> showUsers() {
		return alertrepo.findAll();
	}

	public User saveUsers(User user) {
		User userobj = null;
		if (user.getAnyPrice() != null && user.getEmail() != null) {
			if (user.getDropPercent() != null || user.getExpectedPercent() != null) {
				userobj = alertrepo.save(user);
			}
		}

		return userobj;

	}

}
