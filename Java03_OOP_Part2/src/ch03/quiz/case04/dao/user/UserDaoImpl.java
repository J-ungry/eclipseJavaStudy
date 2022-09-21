package ch03.quiz.case04.dao.user;

import ch03.quiz.case04.domain.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User getUser() {
		return new User("정구리");
	}

	
}
