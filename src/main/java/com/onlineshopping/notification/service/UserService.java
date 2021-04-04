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

	public Boolean saveUsers(User user) {
		Boolean flag = false;

		if (user.getAnyPrice() != null && user.getEmail() != null && user.getEmail().length() != 0
				&& user.getAnyPrice().length() != 0) {
			if ((user.getDropPercent() != null || user.getExpectedPrice() != null)
					&& (user.getExpectedPrice().length() != 0 || user.getDropPercent().length() != 0)) {
				alertrepo.save(user);
				flag = true;
			}
		}

		return flag;

	}

}
