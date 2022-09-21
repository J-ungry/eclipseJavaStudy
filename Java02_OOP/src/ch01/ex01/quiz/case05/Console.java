package ch01.ex01.quiz.case05;

import java.util.Scanner;

public class Console {
	
	
	
	public char inChar(String msg) {
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		char choice = 0;
		
		do {
			System.out.print(msg + ": ");
			String input = sc.nextLine();
			
			if(input.length() == 1) {
				choice = input.charAt(0); //입력한거에 첫번째꺼에 0 번 (1글자 의미) 
				if(choice =='Y' ||choice == 'y'||choice =='n'||choice =='N') {
					isGood = true;
				}
			}
		}while(!isGood);
		
		return choice;
	}
	
	
}
