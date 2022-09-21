package ch02.ex02_input;

import java.util.Scanner;

public class C04Input04 {
	public static void main(String[] args) {
		
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert Name : ");
		String name = sc.next(); //공백이 없는 경우에만 사용 가능 
		
		System.out.println(name);
		
		System.out.print("Insert Age : ");
		int age = sc.nextInt();
		System.out.println(age);
		
		System.out.print("Insert Key : ");
		double height = sc.nextDouble();
		System.out.println(height);
	}

}
