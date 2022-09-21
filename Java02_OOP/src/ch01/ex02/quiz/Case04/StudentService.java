package ch01.ex02.quiz.Case04;

import java.util.Scanner;

public class StudentService {

	Scanner sc = new Scanner(System.in);
	
	public int studentNum() {
		System.out.print("등록할 학생 수 입력 : ");
		return sc.nextInt();
	}
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료");
		System.out.printf("선택 >>");
		
		return sc.nextInt();
	}
	
	public void input(Student s[], int cnt) {
		s[cnt] = new Student();
		s[cnt].input();
	}
}
