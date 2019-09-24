package services;

import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;
import models.User;

@Service
public class BusinessService {

	public User usuario() {
		User user = new User();
		 
		user.setId((long) 1);
		user.setUsername(DigestUtils.md5Hex("Andres"));
		user.setPassword(DigestUtils.md5Hex("admin123"));
		return user;
	}
}
