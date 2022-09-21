package ch04.ex03.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.println("1. 입력 ");
			System.out.println("2. 출력 ");
			System.out.println("3. 수정 ");
			System.out.println("4. 삭제 ");
			System.out.println("0. 프로그램 종료 ");
			
			System.out.println("선택 :");
			int i = sc.nextInt();
			
			if(i==1) {
				System.out.println("입력페이지 입니다");
			}else if(i==2) {
				System.out.println("출력페이지 입니다");
			}else if(i==3) {
				System.out.println("수정페이지 입니다");
			}else if(i==4) {
				System.out.println("삭제페이지 입니다");
			}else if(i==0) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("잘못된 선택입니다");
			}
			
				
			}
		}
	}


