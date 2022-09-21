package ch03.quiz.case04.service.user;

import ch03.quiz.case04.dao.user.UserDao;
import ch03.quiz.case04.domain.User;

public class UserServiceImpl implements UserService{

	private UserDao userDao; // Has-A 관계 
	
	
	public UserServiceImpl(UserDao userDao) { //DI : 매개변수로 객체 넣는거 
		this.userDao = userDao;
	}


	@Override
	public User searchUser() {
		return userDao.getUser();
	}

}
