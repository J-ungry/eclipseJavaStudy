package ch04.ex05.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int total=1;
		do {
			
			//presentation logic
			System.out.print("num1 수 입력 > ");
			a= sc.nextInt();
			System.out.print("num2 수 입력 > ");
			b = sc.nextInt();
			
			//business logic
			total = a+b;
			
			System.out.printf("%d + %d = %d\n",a,b,total);
		}while(total!=0);
	}

}
