package ch03.quiz.project02.presentation;

import java.util.Scanner;

public interface Console {

	Scanner sc = new Scanner(System.in);
	
	 //숫자 정규 표현식 넣어주기 
	static int menu(String[] empMenuItem) {
		
		boolean isGoodValue = false;
		String line = "";
		int num = 0;
		
		do {
			for(int i=0; i<empMenuItem.length; i++) {
				System.out.printf("%d. %s ",(i+1),empMenuItem[i]);
			}
			System.out.println();
			System.out.print("> ");
			line = sc.nextLine();
			
			if(line.length() > 0 && line.matches("[0-9]*")) {
				num = Integer.parseInt(line);
				if(1<=num && num <= 5) isGoodValue = true;
			}
			if(!isGoodValue) {
				System.out.println("ERROR ) 0-5 사이의 정수를 입력하세요 ! ");
			}
			
		}while(!isGoodValue);
		
		return num;
	}
	
	static void showInfo(String message) { //문구 출력 
		System.out.println("\n" + message);
	}
}
