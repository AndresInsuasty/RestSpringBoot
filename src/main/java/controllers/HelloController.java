package controllers;

import org.springframework.web.bind.annotation.RestController;

import models.User;
import services.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/")
public class HelloController {
	@Autowired
	private BusinessService service;

	@GetMapping
	public User index() {
		return service.usuario();
	}

}