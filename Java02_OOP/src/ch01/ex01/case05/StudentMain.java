package ch01.ex01.case05;

import ch01.ex01.quiz.case03.StudentAnswer;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentAnswer s[] = new StudentAnswer[3]; //[0] [1] [2]
		
		s[0] = new StudentAnswer();
		s[0].input();
		s[0].output();
		
//		s[1] = new StudentAnswer();
//		s[2] = new StudentAnswer();
//		
//		System.out.println(s[0]);
//		
		
//		for(int i=0; i<s.length; i++) {
//			s[i] = new StudentAnswer();
//			s[i].input();
//			s[i].output();
//		}
		
		for(StudentAnswer i : s) {
			i = new StudentAnswer();
			i.input();
			i.output();
			
		}
	}

}
