package ch02.ex02.quiz.case03;

public class Student {
	
	Subject s = new Subject();
	
	Student(String name,int kor,int eng){
		s.name = name;
		s.eng =eng;
		s.kor = kor;
	}
	
	public void output() {
		System.out.printf("%s 학생의 총점은 %d 입니다.\n",s.name,(s.kor+s.eng));
	}

}
