package ch01.ex03.quiz.case01;

import java.time.LocalDate;
import java.util.Scanner;

public class PersonTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		int age = 0;
		LocalDate orderDate = null;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.println("나이 : ");
		age = sc.nextInt();
		orderDate = LocalDate.now();
		
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		p.setOrderDate(orderDate);
		
		System.out.println("나이 : "+p.getAge());
		System.out.println("이름 : "+p.getName());
		System.out.println("등록일 : "+ p.getOrderDate());
		
//		Person p = new Person();
//		p.setAge(25);
//		p.setName("Jungry");
//		p.setOrderDate(null);
//		
//		System.out.println("나이 : "+p.getAge());
//		System.out.println("이름 : "+p.getName());
//		System.out.println("등록일 : "+ p.getOrderDate());
		
	
	}

}
