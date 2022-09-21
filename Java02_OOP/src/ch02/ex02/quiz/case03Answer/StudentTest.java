package ch02.ex02.quiz.case03Answer;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student(1001, "Jungry");
		s1.setKor("Kor", 100);
		s1.setEng("Eng", 90);
		
		
		Student s2 = new Student(1001, "Thing");
		s2.setKor("Kor", 80);
		s2.setEng("Eng", 70);
		
		s1.output();
		s2.output();
	}

}
