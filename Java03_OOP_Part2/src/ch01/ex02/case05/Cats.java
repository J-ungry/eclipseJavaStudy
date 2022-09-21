package ch01.ex02.case05;

public class Cats extends Animal{

	public Cats() {
		super("", null); // Animal(부모)가 매개변수가 있는 형태이기 때문에 에러가 나게 된다 
		// TODO Auto-generated constructor stub
		System.out.println("Cats() was called");
	}

	
}
