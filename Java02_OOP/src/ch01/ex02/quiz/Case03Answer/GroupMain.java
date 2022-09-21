package ch01.ex02.quiz.Case03Answer;

public class GroupMain {

	public static void main(String[] args) {
		
		GroupService gs = new GroupService();
		Group[] g = new Group[gs.size()];
		
		int cnt = 0; //배열 객체의 수 , index 
		
		while(true) {
			int menu= gs.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료 ");
				return;
				
			case 1:
				if(cnt == g.length) {
					System.out.println("더 이상 저장할 수 없습니다 ");
				} else {
					gs.input(g, cnt);
					cnt++;
				}
				break;
				
			case 2:
				for(int i=0; i<cnt; i++) {
					g[i].output();
				}
				break;
			default:
				System.out.println("다시 선택해라 빠가야로 꼬노야로 ! ");
			}
		}
	}

}
