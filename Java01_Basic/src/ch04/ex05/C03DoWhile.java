package ch04.ex05;

import java.util.Scanner;

public class C03DoWhile {

	public static void main(String[] args) {
		//한자리 자연수 입력하기 
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		boolean isOne = false;
		
		do {
			System.out.println("Input > ");
			input = sc.nextLine();
			
			if(input.length()==1 && input.charAt(0) >'0' && input.charAt(0) <='9') {
				isOne = true;
			} else {
				System.out.println("한자리 자연수를 입력 하세요. ");
			} 
			}while(!isOne);
			
			System.out.println("END");
		}


}
