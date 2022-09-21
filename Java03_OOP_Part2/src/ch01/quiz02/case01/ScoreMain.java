package ch01.quiz02.case01;

public class ScoreMain {

	public static void main(String[] args) {
		ScoreChild[] sc = new ScoreChild[5];
		ScoreService ss = new ScoreService();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				ss.input(sc);
				break;
			case 2:
				ss.output(sc);
				break;
			default:
				System.out.println("잘못 누르셨습니다");
			}
		}

	}

}
