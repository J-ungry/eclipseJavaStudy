package ch01.ex01.quiz.case03;

import java.util.Scanner;

public class StudentAnswer {

	String name;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	public void input() { //다른 패키지가 되면 제한이 생긴다  그래서 public
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 > ");
		name = sc.next();
		System.out.println("국어 점수 입력 > ");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력 > ");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력 > ");
		math = sc.nextInt();
		
		total = kor + eng + math ;
		avg = total / 3.0;
		
	}
	
	public void output() {
		
		System.out.println("이름 > "+name);
		System.out.println("총점 > "+total);
		System.out.println("평균 > "+avg);
	}
}
