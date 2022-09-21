package ch04.ex04;

public class C04NestedWhile {

	public static void main(String[] args) {
		int dan = 2;
		int units = 1;
		
		while(dan <= 9) {
			units = 1;
			while(units <= 9) {
				System.out.printf("%d * %d = %d\n",dan,units,(dan*units));
				units++;
			}
			dan ++;
			System.out.println();
		}
		
	}

}
