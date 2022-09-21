package ch04.ex02.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//switch case jungry
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
			System.out.printf("%d 는 31일 까지 입니다",month);
			break;
		case 2:
			System.out.printf("%d 는 28일 까지 입니다",month);
			break;
		case 3:
			System.out.printf("%d 는 31일 까지 입니다",month);
			break;
		case 4:
			System.out.printf("%d 는 30일 까지 입니다",month);
			break;
		case 5:
			System.out.printf("%d 는 31일 까지 입니다",month);
			break;
		case 6:
			System.out.printf("%d 는 30일 까지 입니다",month);
			break;
		case 7:
			System.out.printf("%d 는 31일 까지 입니다",month);
			break;
		case 8:
			System.out.printf("%d 는 31일 까지 입니다",month);
			break;
		case 9:
			System.out.printf("%d 는 30일 까지 입니다",month);
			break;
		case 10:
			System.out.printf("%d 는 31일 까지 입니다",month);
			break;
		case 11:
			System.out.printf("%d 는 30일 까지 입니다",month);
			break;
		case 12:
			System.out.printf("%d 는 31일 까지 입니다",month);
			break;
			
		default:
			System.out.println("다시 입력하세요 ");
		}
		
		//if 문 jungry made
		int now = month %2;
		if(month <= 7) {
			if(now==1) {
				System.out.printf("%d 는 31일 까지 입니다",month);
			} else {
				if(month ==2) {
					System.out.printf("%d 는 28일 까지 입니다",month);
				} else {
					System.out.printf("%d 는 30일 까지 입니다",month);
				}
			}
		}else if(month >7 && month <= 12) {
			if(now==0) {
				System.out.printf("%d 는 31일 까지 입니다",month);
			}else {
				System.out.printf("%d 는 30일 까지 입니다",month);
			}
		} else {
			System.out.println("다시 입력하세요 ");
		}
		
	}

}
