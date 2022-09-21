package ch01.ex01.quiz.case04;

import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Score score = new Score();
		
		System.out.print("인원 수 입력 > ");
		int person = sc.nextInt();
		
		//배열 생성하기 
		
		score.makeArr(person);
		
		boolean check = true;
		
		while(check) {
			int menu = score.menu();
			
			switch(menu) {
			case 1:
				score.input();
				break;
			case 2:
				score.output();
				break;
			case 0:
				check = false;
				break;
			}
		}
		
		
	}

}
