package ch01.ex02.arrayList.quiz.case01;

public class Main {

	public static void main(String[] args) {

		Student s1 = new Student("Jungry");
		
		s1.input("kor",100);
		s1.input("eng",100);
		
		System.out.println(s1);
		
		Student s2 = new Student("Thing");
		
		s2.input("kor",70);
		s2.input("eng",85);
		s2.input("math",100);

		System.out.println(s2);
	}

}
