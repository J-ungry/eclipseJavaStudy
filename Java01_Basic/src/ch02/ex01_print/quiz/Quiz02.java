package ch02.ex01_print.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		int a,b,c;
		a = 1;
		b = 3;
		
		System.out.printf("a : %d b : %d\n",a,b);
		c = a;
		a = b;
		b = c;
		System.out.printf("a : %d b : %d\n=",a,b);
	}
}
