package sub_quiz.quiz01Answer;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//전체적인 실행 흐름 나오게 된다 
		
		User[] u = new User[5];
		UserService us = new UserService();
	
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				us.signUp(u);
				break;
			case 2:
				us.login(u);
				break;
			default:
				System.out.println("다시 입력하세요 ");
				
			}
		}
	}

}
