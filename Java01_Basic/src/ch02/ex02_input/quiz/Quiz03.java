package ch02.ex02_input.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert name");
		String name = sc.next();
		System.out.print("Insert Kor Score");
		int kor = sc.nextInt();
		System.out.print("Insert Eng Score");
		int eng = sc.nextInt();
		System.out.print("Insert Math Score");
		int math = sc.nextInt();
		
		int total = kor +eng + math;
		double avg = (double)total/3;
		
		System.out.println("name : " + name);
		System.out.println("total : "+total);
		System.out.printf("avg : %.2f",avg);
	}
}
