package ch02.ex02.quiz.case03Answer;

public class Student {
	
	int studentId;
	String studentName;
	
	Subject kor;
	Subject eng;
	
	public Student(int id, String name) {
		this.studentId = id;
		this.studentName = name;
		
		kor = new Subject();
		eng = new Subject();
		
	}
	
	public void setKor(String name, int score) {
		kor.score = score;
		kor.subName = name;
	}
	
	public void setEng(String name, int score) {
		eng.score = score;
		eng.subName = name;
	}
	
	public void output() {
		System.out.printf("%s 학생의 총점은 %d 입니다.\n",studentName,(kor.score+eng.score));
	}
}
