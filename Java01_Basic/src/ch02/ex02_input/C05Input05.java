package ch02.ex02_input;

import java.util.Scanner;

public class C05Input05 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Insert Address :");
		
		String address = scanner.next();
		System.out.println(address);
		
		scanner.nextLine();
		System.out.print("Insert Address :");
		String address2 = scanner.nextLine();
		System.out.println(address2);
	}

}
