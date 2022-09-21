package ch03.ex01.case04;

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Jungry");
		
		Student s2 = new Student();
		s2.setName("Thing");
		
		System.out.println(s1.getName()+" , "+s1.getStudentId());
		System.out.println(s2.getName()+" , "+s2.getStudentId());
		
		System.out.println(Student.serialNum);
		
	}

}
