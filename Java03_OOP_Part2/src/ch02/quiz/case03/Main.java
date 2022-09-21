package ch02.quiz.case03;

public class Main {
	public static void main(String[] args) {

		MainService ms = new MainService();

		
		while(true) {
			int menu = ms.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료 ");
				return;
			case 1:
				ms.input(null);
				break;
			case 2:
				ms.output(null);
				break;
			default:
				System.out.println("다시 입력하세요 ");
			}
			
			
		}
	}
}
