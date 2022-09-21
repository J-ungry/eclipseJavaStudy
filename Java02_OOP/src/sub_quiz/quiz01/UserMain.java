package sub_quiz.quiz01;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserService us = new UserService();
		User[] u = new User[5]; //크기가 5인 배열 생성 
		int count = 0;
		
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 1:
				us.newUser(u,count);
				count ++;
				break;
			case 2:
				us.login(u,count);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("다시 입력하세");
			}
			
		}
	
	}

}
