package ch01.ex03.quiz.Case02;

import java.util.Scanner;


public class Score {

	Scanner sc = new Scanner(System.in);
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	private void inputScore() {
		System.out.print("Insert name >>");
		name = sc.next();
		
		while(true) {
			System.out.print("Insert Kor Score >>");
			kor = sc.nextInt();
			
			if(kor < 0 || kor >100) {
				System.out.println("다시 입력 고");
			}else break;
		}
		while(true) {
			System.out.print("Insert Eng Score >>");
			eng = sc.nextInt();
			
			if(eng < 0 || eng >100) {
				System.out.println("다시 입력 고");
			}else break;
		}
		while(true) {
			System.out.print("Insert Math Score >>");
			math = sc.nextInt();
			
			if(math < 0 || math >100) {
				System.out.println("다시 입력 고");
			}else break;
		}
		
		total = kor + eng + math;
		avg = total/3.0;
	}
	
	private void output() {
			System.out.println("###" + name + "###");
			System.out.println("Total >> "+total);
			System.out.println("Avg >> "+avg);
		
	}
	public void setScore() {
		inputScore();
	}
	
	public void getScore() {
		output();
	}
	
}
