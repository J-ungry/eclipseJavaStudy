package ch04.ex05.quiz;

import java.util.Scanner;

public class Quiz04_Answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char isRepeat =0;
		do {
			String input ="";
			boolean isGood = false;
			
			int a = 0;			// 숫자1
			int b = 0;			// 숫자2
			char op = 0;		// 사칙 연산자 
			int result = 0; 	// 처리 결과 
			 	// y/n
			
			//input
			do {
				System.out.println("숫자 1 : ");
				input = sc.nextLine();
				if(input.length()== 1 && input.charAt(0) > '0' && input.charAt(0)<='9') {
					isGood = true;
					a = Integer.parseInt(input); //change to int
				} else {
					isGood = false;
					System.out.println("ERROR] Plz input single digit number");
				}
			}while(!isGood);
			
			do {
				System.out.println("Oper : ");
				input = sc.nextLine();
				if(input.length()==1) {
					op = input.charAt(0);
					if (op=='+'||op=='-'||op=='*'||op=='/') isGood= true;
					else isGood=false;
					if(!isGood) System.out.println("ERROR] INSERT +,-,*,/ ");
				}else {
					isGood = false;
					System.out.println("ERROR] Plz insert");
				}
			}while(!isGood);
			
			do {
				System.out.println("숫자 2 : ");
				input = sc.nextLine();
				if(input.length()== 1 && input.charAt(0) > '0' && input.charAt(0)<='9') {
					isGood = true;
					b = Integer.parseInt(input); //change to int
				} else {
					isGood = false;
					System.out.println("ERROR] Plz input single digit number");
				}
			}while(!isGood);
			
			switch(op) {
			case '+': result = a + b; break;
			case '-': result = a - b; break;
			case '*': result = a * b; break;
			case '/': result = a / b; break;
				
			}
			
			System.out.printf("%d %c %d = %d",a,op,b,result);
			
			do {
				System.out.print("계속 하시겠습니까 ? Y/N > ");
				input = sc.nextLine();
				if(input.length()==1) {
					isRepeat = input.charAt(0);
					if(isRepeat =='Y'||isRepeat =='y'||isRepeat =='N'||isRepeat =='n') isGood = true;
					else isGood = false;
				} else isGood = false;
				if(!isGood) System.out.println("ERROR] Plz insert Y or N");
			}while(!isGood);
		}while(isRepeat !='N'&& isRepeat !='n');
	System.out.println("End");
	}

}
