package ch04.ex04.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		int i=0;
		int sum = 0;
		for(; i<101; i++) {
			sum += i;
		}
		System.out.println("for > "+sum);
		
		i=0;
		sum = 0;
		while(i <101) {
			sum += i;
			i++;
		}
		System.out.println("while > "+sum);
	}

}
