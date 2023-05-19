package anyQuestions.logic;

import anyQuestions.boundaries.UserBoundary;

public interface UserService {

	public UserBoundary storeUser(UserBoundary newUser);
	
	public UserBoundary login(String userName, String password);
}
