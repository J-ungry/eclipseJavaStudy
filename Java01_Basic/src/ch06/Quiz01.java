package ch06;

import java.util.Scanner;

public class Quiz01 {
	
	public static void menu() {//객체 생성하지 않고 바로 끌어다가 쓸수있는 애들 
		
		System.out.println("1. 더하기 ");
		System.out.println("2. 빼기 ");
		System.out.println("3. 곱하기 ");
		System.out.println("4. 나누기 ");
		System.out.print("선택 > ");
	}
	
	public static int input(String str) {
		System.out.print(str + " 정수 입력 > ");
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	
	public static void output(int result) {
		System.out.println("계산 결과 > "+result);
	}
	
	public static int calc(int a,int b, int c) {
		switch(a) {
		case 1:
			return b+c;
		case 2:
			return b-c;
		case 3:
			return b*c;
		case 4:
			return b/c;
		}
		return 0;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			menu();
			
			
			int select = sc.nextInt();
			
			int num1 = input("첫번째 ");
			int num2 = input("두번째 ");
			
			output(calc(select,num1,num2));
		}
		
		
		
	}

}
