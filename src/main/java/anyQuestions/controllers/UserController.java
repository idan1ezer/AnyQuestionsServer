package anyQuestions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import anyQuestions.boundaries.UserBoundary;
import anyQuestions.services.JpaUserService;


@RestController
public class UserController {

	JpaUserService service;
	
	@Autowired
	public UserController(JpaUserService service) {
		this.service = service;
	}
	
	@RequestMapping(
			path="/anyQuestions/users/addUser",
			method=RequestMethod.POST,
			produces=MediaType.APPLICATION_JSON_VALUE,
			consumes=MediaType.APPLICATION_JSON_VALUE)
	public UserBoundary createUser(@RequestBody UserBoundary  newUser) {
		
		return this.service.storeUser(newUser);
	}
	
	@RequestMapping(
			path="/anyQuestions/users/login/{username}/{password}",
			method=RequestMethod.GET,
					produces=MediaType.APPLICATION_JSON_VALUE)
	public UserBoundary login(@PathVariable("username") String username, @PathVariable("password") String password) {	
		
		return this.service.login(username, password);
	}
	
}
