package ch04.ex05.quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		ArrayList<String> name = new ArrayList<String>();
//		ArrayList<Integer> total = new ArrayList<Integer>();
//		ArrayList<Double> avg = new ArrayList<Double>();
		
		String name = "";
		int total = 0;
		double avg = 0;
		
		
		boolean check = true;
		while(check){
			System.out.println("1. 성적 입력 ");
			System.out.println("2. 성적 출력 ");
			System.out.println("0. 프로그램 종료  ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:
				System.out.println("### 성적 입력 ###");
				System.out.print("이름 > ");
				name = sc.nextLine();
				System.out.print("국어 > ");
				total += sc.nextInt();
				System.out.print("수학 > ");
				total += sc.nextInt();
				System.out.print("영어 > ");
				total += sc.nextInt();
				
				avg = total /3;
				break;
			
			
			case 2:
				
				System.out.println("### 성적 출력 ###");
				System.out.printf("이름 > %s\n",name);
				System.out.printf("총점 > %d\n",total);
				System.out.printf("평균 > %.1f\n",avg);
				
				break;
			
			case 0:
				System.out.println("프로그램을 종료합니다 ");
				check = false;
				break;
			}	
		}
		
		

	}

}
