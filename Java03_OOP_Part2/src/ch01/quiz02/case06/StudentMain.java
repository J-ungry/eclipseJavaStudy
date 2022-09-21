package ch01.quiz02.case06;

public class StudentMain {

	public static void main(String[] args) {
		StudentService ss = new StudentService();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료 ");
				return;
			case 1:
				ss.input();
				break;
			case 2:
				ss.output();
				break;
				
			default:
				System.out.println("다시 입력하세요 ");
			}
			

		}

	}

}
