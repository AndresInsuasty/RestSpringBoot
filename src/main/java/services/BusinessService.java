package services;

import org.springframework.stereotype.Service;

import models.User;

@Service
public class BusinessService {

	public User usuario() {
		User user = new User();
		user.setId((long) 1);
		user.setUsername("Andres");
		user.setPassword("admin123");
		return user;
	}
}
