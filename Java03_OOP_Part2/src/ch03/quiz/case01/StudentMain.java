package ch03.quiz.case01;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentServiceImple ss = new StudentServiceImple();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 1:
				ss.input();
				break;
			case 2:
				ss.output();
				break;
			case 3:
				ss.modify();
				break;
			case 4:
				ss.delete();
				break;
			case 0: 
				System.out.println("프로그램 종료 ");
				return;
			default:
				System.out.println("다시 입력해주세요 ");
			}
		}

	}

}
