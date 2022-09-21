package ch01.ex03.quiz.Case02;

import java.util.Scanner;

public class ScoreService {
	
	Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력 ");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("선택 : ");
		return sc.nextInt();
	}
}
