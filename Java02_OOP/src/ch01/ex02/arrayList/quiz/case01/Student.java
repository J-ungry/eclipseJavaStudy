package ch01.ex02.arrayList.quiz.case01;

import java.util.ArrayList;

public class Student {

	String name;
	private ArrayList<Subject> subjectList;
	int total;
	
	public Student(String name) {
		this.name = name;
		subjectList = new ArrayList<Subject>(); //객체 생성하기 
	}
	public void input(String name,int score) {
		Subject subject = new Subject();
		subject.setSubName(name);
		subject.setScore(score);
		subjectList.add(subject); //점수 입력해주기 
		total += score; //total 에 점수 더해주기 
	}
	
	
	
	@Override
	public String toString() {
		String str = "";
		for(Subject sub : subjectList) {
			str += "학생"+name+"의 "+sub.getSubName()+"성적은 "+sub.getScore()+"점 입니다.\n";
		}
		str += "학생"+name+"의 총 점은 "+total+"입니다\n";
		return str;
	}
	
}
