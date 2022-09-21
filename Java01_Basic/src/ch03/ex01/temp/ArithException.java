package ch03.ex01.temp;

public class ArithException {

	public static void main(String[] args) {
		
		try {
			System.out.println(5/0);
		} catch (ArithmeticException e) {
			System.out.println("0 division Error");
		}
		
	}

}
