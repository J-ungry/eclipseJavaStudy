package ch01.ex03.case02;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person();
		
//		p.name = "동수 ";
//		p.age = 25;
		
		p.setAge(20);
		p.setName("Jungry");
		
		System.out.printf("%s  ,  %d",p.getName(),p.getAge());
	}

}
