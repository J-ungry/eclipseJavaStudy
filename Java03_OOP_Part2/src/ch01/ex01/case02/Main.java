package ch01.ex01.case02;

public class Main {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Tiger tiger = new Tiger();
		
		lion.run();
		tiger.run(); //부모 클래스에서 바로 상속을 받은걸 호출할 수있다. 
	}

}
