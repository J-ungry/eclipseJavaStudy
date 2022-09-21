package ch01.ex01.quiz.case06;

import java.util.Scanner;

public class ConsoleAnswer {

	public static char inYn(String msg) {
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		char choice = 0;
		
		do {
			System.out.print(msg + "(y/n) ? ");
			String input = sc.nextLine();
			
			if(input.length() == 1) {
				choice = input.charAt(0); //입력한거에 첫번째꺼에 0 번 (1글자 의미) 
				if(choice =='Y' ||choice == 'y') choice = 'y' ;
				if(choice =='n'||choice =='N')  choice = 'n';
				
			} 
			isGood = (choice=='y'||choice =='n');
			
			if(!isGood) System.out.println("Error !!! ");
		}while(!isGood);
		
		return choice;
	}

}
