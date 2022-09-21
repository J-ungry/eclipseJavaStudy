package ch01.ex02.case07;

public class Cat extends Animal{

	private int age;
	
	public Cat(String animalName, int age) { //부모의 field 와 자식의 field 에 대한 조건을 모두 충족할 수 있다 
		super(animalName);
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
