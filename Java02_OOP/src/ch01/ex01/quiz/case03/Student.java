package ch01.ex01.quiz.case03;

import java.util.Scanner;

public class Student {
/*이름 , 국어 , 영어 , 수학 점수를 입력 출력하는 메소드를 만들어 
 * StudentMain 클래스에서 실행 
 */
	
	String name;
	int kor;
	int eng;
	int math;
	
	int total;
	double avg;
	
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력하기 > ");
		name = sc.nextLine();
		System.out.print("국어점수 입력하기 > ");
		kor= sc.nextInt();
		System.out.print("수학점수 입력하기 > ");
		math = sc.nextInt();
		System.out.print("영어점수 입력하기 > ");
		eng = sc.nextInt();
		
		total = kor + eng + math;
		avg = total / 3.0;
		
	}
	
	void output() {
		
		
		System.out.println("이름 > "+name);
		System.out.println("총점 > "+total);
		System.out.println("평균 > "+avg);
	}
}
