package ch04.ex01.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		System.out.println("1. 입력\n2. 출력\n3. 수정\n4. 삭제\n0. 프로그램 종료");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("입력  ");
		} else if(num ==2) {
			System.out.println("출력  ");
		}
		else if(num ==3) {
			System.out.println("수정  ");
		}
		else if(num ==4) {
			System.out.println("삭제 ");
		}
		else if(num ==0) {
			System.out.println("프로그램 종료 ");
		}else {
			System.out.println("없는 번호입니다 ");
		}
		
	}

}
