package ch02.ex01.case03;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "서정우";
		s1.score = 100;
		System.out.println(s1);
			
		Student s2 = new Student("정구링") ;
		s2.score = 200;
		System.out.println(s2);
		
		Student s3 = new Student("윤슬",100);
		System.out.println(s3.toString());
	}

}
