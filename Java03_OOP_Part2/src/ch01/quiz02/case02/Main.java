package ch01.quiz02.case02;

public class Main {

	public static void main(String[] args) {

		Fruit banana = new Banana(); //upcasting
		Fruit apple = new Apple();
		Fruit orange = new Orange();
		
		banana.output();
		apple.output();
		orange.output();
	}

}
