package ch03.ex01.case04;

public class Student {

	static int serialNum = 10000; //공유할거임 , 시작 넘버 (스튜던트 아이디를 하나씩 늘림) 
	
	
	private int studentId;
	private String name;
	
	public Student() {
		serialNum++; //자동으로 학번을 할당ㅎ게 된다 
		studentId = serialNum;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}
	

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
