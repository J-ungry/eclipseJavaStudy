package ch01.ex02.quiz.case06;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ScoreService ss = new ScoreService();
		Score[] s = new Score[3];
		
		int cnt =0;
		int deleteIndex =0;
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료 ");
				return;
			case 1:
				//입력 받기 (삭제도 고려해야함)
				if(cnt == 3) {
					System.out.println("더이상 추가 불가데쇼 !");
				} else {
					s[cnt] = new Score();
					ss.addScore(s[cnt]);
					cnt ++;
				}
				break;
			case 2:
				//출력 
				for(int i=0; i<cnt; i++) {
					ss.output(s[i]);
				}
				break;
				
			case 3:
				//수정 
				System.out.print("수정하고자 하는 이름을 입력하세요");
				String name = sc.next();
				
				boolean check = false;
				for(int i=0; i<cnt; i++) {
					check = ss.rename(s[i],name,check);
				}
				if(!check) {
					System.out.println("이름을 다시 입력해주세요"); }
				break;
				
			case 4:
				
				//삭제 
				System.out.print("삭제하고자 하는 이름을 입력하세요");
				String deleteName = sc.next();
				sc.nextLine();
				boolean deleteCheck = false;
				for(int i=0; i<cnt; i++) {
					deleteCheck = ss.findName(s[i],deleteName,i);
					deleteIndex =i;
					if(!deleteCheck) {
						System.out.println("이름을 다시 입력해주세요");
					}else { //삭제하려는게 존재한다면 
						for(int j=deleteIndex;j<s.length-1;j++) {
							s[j] = s[j+1];
						}
						cnt--;
					}
				}
				
				
				break;
			}
		}
	}

}
