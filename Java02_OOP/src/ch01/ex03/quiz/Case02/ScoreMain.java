package ch01.ex03.quiz.Case02;

public class ScoreMain {

	public static void main(String[] args) {

		Score s[] = new Score[3];
		ScoreService ss = new ScoreService();
		
		int cnt = 0;
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료 ");
				return;
			case 1:
				s[cnt] = new Score();
				s[cnt].setScore();
				
				cnt ++;
				break;
			case 2:
				for(int i=0; i<cnt; i++) {
					s[i].getScore();
				}
				break;
			default:
				System.out.println("잘못 입력스 ");
			
			}
		}
	}

}
