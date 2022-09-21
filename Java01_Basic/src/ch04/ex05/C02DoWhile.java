package ch04.ex05;

import java.util.Scanner;

public class C02DoWhile {

	public static void main(String[] args) {
		
		//한글자만 입력할때까지 반복 
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		int len = 0;
		
		do {
			System.out.print("> ");
			input = sc.nextLine();
			
			len = input.length();
			System.out.println(len + "입력 했습니다. ");
		}while(len==0 || len > 1);
		
		System.out.println("End");
	}

}
