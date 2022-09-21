package ch06;

import java.util.Scanner;

public class C02Method2 {
	
	public static void subject() { //return X 매개변수 X
		System.out.println("계산기 프로그램 ");
	}
	/*
	public static int input() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	*/
	
	public static int input_2(String str) {
		System.out.print(str + " 정수 입력 > ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static int add(int num1,int num2) {
		return num1+ num2;
	}
	
	public static void output(int sum) {
		System.out.println("두 수의 합 : "+sum);
	}

public static void main(String[] args) {		
		
		
		subject(); 
/*		
		int num1 = input();
		System.out.print("두번째 정수 입력 > ");
		int num2 = input();
*/
		int num1 = input_2("첫번째");
		int num2 = input_2("두번째");
		
				
		int sum = add(num1,num2);
		
		output(sum);
	}

}
