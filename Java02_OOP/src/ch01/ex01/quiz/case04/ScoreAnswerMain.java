package ch01.ex01.quiz.case04;

import java.util.Scanner;

public class ScoreAnswerMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력 : ");
		int inwon = sc.nextInt();
		
		int cnt = 0;
		ScoreAnswer s[] = new ScoreAnswer[inwon];
		
		while(true) {
			System.out.println("1. 입력 ");
			System.out.println("2. 출력 ");
			System.out.println("0. 프로그램 종료 ");
			System.out.print(">>> ");
			
			int menu = sc.nextInt();
			int count = 0;
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료 ");
				return;
			case 1:
				s[cnt] = new ScoreAnswer();
				s[cnt].input();
				cnt ++;
				break;
			case 2:
				for(int i=0; i<cnt;i++) {
					s[i].output();
				}
				break;
			}
			
		}
	}

}
