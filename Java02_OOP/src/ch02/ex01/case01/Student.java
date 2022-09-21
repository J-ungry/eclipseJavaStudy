package ch02.ex01.case01;

public class Student {

	//field
	int studentNumber;
	String studentName;
	String majorName;
	int majorCode;
	int grade;
	
	//생성자가 자동으로 만들어 진다 new 쓸때 동시에 생성됨 ! 
	public Student() {
		System.out.println("default constructor was generated");
	}
	
	//method
	public void showStudentInfo() {
		System.out.printf("이름 : %s\n 학번 : %d\n 전공 : %s\n",studentName,studentNumber,majorName);
	}
}
