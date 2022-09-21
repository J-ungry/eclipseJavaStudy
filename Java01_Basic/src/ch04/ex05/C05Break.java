package ch04.ex05;

public class C05Break {

	public static void main(String[] args) {
		//100 
		int sum = 0;
		for( int i=0;i<100;i++) {
			sum += i;
			if (sum >= 200) {
				System.out.println("n > "+i);
				System.out.println("sum > " + sum);
				break;
			}
		}
	}

}
