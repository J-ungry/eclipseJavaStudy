package ch01.ex02.quiz.Case03;

import java.util.Scanner;

public class GroupMain {

	public static void main(String[] args) {
		
		GroupService gs = new GroupService();
		int groupCnt= gs.size();
		
		boolean check = true;
		
		Group[] g = new Group[groupCnt];
		
		
		int cnt = 0; //몇개가 입력되었는지 count
		do {
			int menuNum = gs.menu();
			switch(menuNum) {
			case 0:
				System.out.println("프로그램 종료");
				check = false;
				break;
			case 1:
				g[cnt] = new Group();
				g[cnt].input();
				cnt ++;
				break;
			case 2:
				for(int i=0; i<cnt; i++) {
					g[i].output(i);
				}
				break;
			}
		}while(check);
		
	}

}
