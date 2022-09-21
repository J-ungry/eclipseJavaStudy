package ch04.ex03;

public class C05GuGuDan {

	public static void main(String[] args) {
		
		int dan = 2;
		int units = 1;
		
		for(; dan <=9; dan++) {
			for(units=1;units<=9; units++) {
				System.out.printf("%d * %d = %d\n",dan,units,(dan*units));
			}
			System.out.println();
		}
		
	}

}
