package ch03.quiz.case04.presentation.user;

import ch03.quiz.case04.presentation.Console;
import ch03.quiz.case04.service.user.UserService;

public class UserIo {

	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void run() {
		Console.showInfo(userService.searchUser());
	}
}
