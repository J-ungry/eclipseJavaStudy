package ch01.quiz02.case07;



public class UserMain {
	public static void main(String[] args) {
		UserService us = new UserService();
		
		while(true) {
			int menu = us.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료 ");
				return;
			case 1:
				us.input();
				break;
			case 2:
				us.output();
				break;
				
			default:
				System.out.println("다시 입력하세요 ");
			}
	}

}
}
