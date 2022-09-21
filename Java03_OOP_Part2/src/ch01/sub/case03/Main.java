package ch01.sub.case03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		User u = new User();
		
		System.out.println("Insert ID");
		u.setId(sc.next());
		System.out.println("Insert PW");
		u.setPw(sc.next());
		System.out.println("Insert Name");
		u.setName(sc.next());
		System.out.println("Insert Age");
		u.setAge(sc.nextInt());
		System.out.println("Insert Email");
		u.setEmail(sc.next());
		
		System.out.println(u.toString());
	}

}
