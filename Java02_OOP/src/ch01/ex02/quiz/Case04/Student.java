package ch01.ex02.quiz.Case04;

import java.util.Scanner;

public class Student {
	
	Scanner sc = new Scanner(System.in);

	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	public void input() {
		System.out.printf("이름 입력 > ");
		name = sc.next();
		System.out.printf("국어 점수 입력 > ");
		kor = sc.nextInt();
		System.out.printf("영어 점수 입력 > ");
		eng = sc.nextInt();
		System.out.printf("수학 점수 입력 > ");
		math = sc.nextInt();
		
		total = kor+eng+math;
		avg = total / 3.0;
	}
	
	public void output() {
		System.out.printf("### %s ###\n",name);
		System.out.println("총 점  > "+total);
		System.out.println("평균   > "+avg);
	}
}
