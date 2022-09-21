package ch03.ex01.case05;

public class Main {

	public static void main(String[] args) {
		
		D d = new D();
		
		C c = d;//상속이라 저장 가능 
		B b = d; //구현이라 저장 가능 
		A a = d;
		
		d = (D) c;
		d = (D) b;
		d = (D) a;
	}

}
