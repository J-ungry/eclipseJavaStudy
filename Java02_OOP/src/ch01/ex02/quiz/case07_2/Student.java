package ch01.ex02.quiz.case07_2;

public class Student {

	static int startId = 1001;
	int studentId;
	String name;
	String major;
	
	Student(){
		studentId   = startId++;
	}
}
