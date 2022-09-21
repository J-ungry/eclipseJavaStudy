package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Kor Score");
		int kor = sc.nextInt();		
		System.out.println("Insert Eng Score");
		int eng = sc.nextInt();
		System.out.println("Insert Math Score");
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = (double)total / 3;
		
		char grade = (avg >= 90)?'A':(avg>=80)?'B':(avg>=70)?'C':'D';
		
		System.out.printf("Total : %d\nAvg : %.1f\nGrade : %c ",total,avg,grade);
	}

}
