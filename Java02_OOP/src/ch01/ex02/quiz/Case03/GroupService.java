package ch01.ex02.quiz.Case03;

import java.util.Scanner;

public class GroupService {
	Scanner sc = new Scanner(System.in);
	public int size() {
		System.out.println("입력할 그룹 수 > ");
		return sc.nextInt();
	}
	public int menu() {
		
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.printf("선택 >>");
		return sc.nextInt();
		
	}
	
}
