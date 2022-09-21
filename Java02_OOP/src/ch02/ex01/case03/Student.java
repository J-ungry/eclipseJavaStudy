package ch02.ex01.case03;

public class Student {

	String name;
	int score;
	
	public Student() {
		
	}
	public Student(String name) {
		this.name = name;
	} //필드 중 하나만 초기화하는 친구 
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
	
}
