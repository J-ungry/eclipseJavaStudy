package ch04.ex02.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Scissor 2. Rock 3. Paper");
		System.out.print("> ");
		
		int my = sc.nextInt();
		int com = (int)( Math.random()*3)+1; // 1~3 
		
		if (my >= 1 && my <= 3) {
			//출력
			switch(my) {
			case 1:System.out.println("You : Scissor"); break;
			case 2:System.out.println("You : Rock"); break;
			case 3:System.out.println("You : Paper"); break;
//			default: System.out.println("입력 오류 : 메뉴의 번호를 입력하세요"); return;
				}
			
			switch(com) {
			case 1:System.out.println("Com : Scissor"); break;
			case 2:System.out.println("Com : Rock"); break;
			case 3:System.out.println("Com : Paper"); break;
				}
			
			int result = (my-com);
			
			if(result==0) {
				System.out.println("Draw !");
			} else if(result == 1 || result==-2) {
				System.out.println("You Win !");
			} else if(result == -1 || result == 2) {
				System.out.println("You Lose . . ");
			} 
		} else {System.out.println("입력 오류 :메뉴의 번호를 입력하세요");}
		
		
		
	}

}
