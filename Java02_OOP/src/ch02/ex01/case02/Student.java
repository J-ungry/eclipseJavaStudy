package ch02.ex01.case02;

public class Student {

	//field
	int studentNumber;
	String studentName;
	String majorName;
	int majorCode;
	int grade;
	
	//생성자(constructor) 가 자동으로 만들어 진다 new 쓸때 동시에 생성됨 ! 
	
	public Student() { //default 생ㅇ성자 
		
	}
	public Student(int studentNumber, String studentName, String majorName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.majorName = majorName;
	}
	
	//method
	public void showStudentInfo() {
		System.out.printf("이름 : %s\n 학번 : %d\n 전공 : %s\n",studentName,studentNumber,majorName);
	}

	
}
