package ch03.quiz.case04;

import ch03.quiz.case04.dao.user.UserDao;
import ch03.quiz.case04.dao.user.UserDaoImpl;
import ch03.quiz.case04.presentation.Console;
import ch03.quiz.case04.presentation.user.UserIo;
import ch03.quiz.case04.service.user.UserService;
import ch03.quiz.case04.service.user.UserServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		UserDao userDao = new UserDaoImpl(); //인터페이스르ㅡㄹ 구현한 친구를 불러와야한다  왜냐면 인터페이스는 객체 생성이 안되니까농 
		UserService userService = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userService);
		
		userIo.run();
		

	}

}
