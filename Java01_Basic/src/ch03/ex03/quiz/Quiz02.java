package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert First Num");
		int a = sc.nextInt();
		System.out.println("Insert Second Num");
		int b = sc.nextInt();
		System.out.println("Insert Third Num");
		int c = sc.nextInt();
		
		int result = (a>b) ? a : ( (b>c) ? b : c) ;
//		int result = (a>b && a>c) ? a : ( (b>c) ? b : c) ;
		System.out.println("Biggest num : " + result); 
	}

}
