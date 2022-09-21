package ch01.ex03.case01;

public class PersonTest {

	public static void main(String[] args) {

		Person p = new Person();
		p.name = "김석영";
		p.age = 25;
		
		p.setName("서정구리");
		p.setAge(25);
		
		System.out.printf("%s  ,  %d\n",p.name,p.age);
		System.out.printf("%s  ,  %d",p.getName(),p.getAge());
	}

}
