package ch04.ex02.quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력하기 ");
		int i = sc.nextInt();
		
		switch(i%2) {
		case 0:
			System.out.println("짝수 입니다 ");
			break;
		case 1:
			System.out.println("홀수 입니다 ");
			break;
		default:
			System.out.println("Error");
		}
	}

}
