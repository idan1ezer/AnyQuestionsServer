package anyQuestions.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import anyQuestions.boundaries.UserBoundary;
import anyQuestions.data.UserEntity;
import anyQuestions.data.converters.UserConverter;
import anyQuestions.data.crud.UserCrud;
import anyQuestions.logic.UserService;

@Service
public class JpaUserService implements UserService {
	
	private UserConverter converter;
	private UserCrud crud;

	@Autowired
	public JpaUserService(UserConverter converter, UserCrud crud) {
		this.converter = converter;
		this.crud = crud;
	}
	
	@Override
	@Transactional
	public UserBoundary storeUser(UserBoundary newUser) {
		UserEntity entity = this.converter.toEntity(newUser);
		entity.setUserId(newUser.getUsername() + newUser.getPassword());
		entity.setCreatedTimestamp(new Date());
		
		this.crud.save(entity);
		return this.converter.toBoundary(entity);
	}

	@Override
	public UserBoundary login(String userName, String password) {
		UserEntity user = getUserByUserId(userName + password);
		if (user != null && user.getPassword().equals(password)) {
			return converter.toBoundary(user);
		} else {
			return null;
		}
	}
	
	@Transactional
	public UserEntity getUserByUserId(String id) {
		return this.crud.findById(id)
			.orElseThrow(() -> new RuntimeException("Could not find user by id (username+password): " + id));
	}
}
