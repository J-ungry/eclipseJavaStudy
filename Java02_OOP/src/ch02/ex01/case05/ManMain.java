package ch02.ex01.case05;

public class ManMain {

	public static void main(String[] args) {

		Man m = new Man();
		m.showManInfo();
		System.out.println(m);
		
		Man m2 = m.getMan();
		System.out.println(m2);
		
		
	}

}
