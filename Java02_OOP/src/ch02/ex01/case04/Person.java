package ch02.ex01.case04;

public class Person {

	String name;
	int age;
	
	public Person() { //기본 생성자에 초기화 하는 생성자를 넣어줘서 
		this("이름없음", 1);
	} // 기본 생성자 

	public Person(String name, int age) {
		this.name = name; //this 는 field 를 의미한다 
		this.age = age;
	}
}
