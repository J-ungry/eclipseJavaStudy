package ch04.ex03.quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		for(int i=1; i<10; i++) {
			if(i%3 ==0) {
				System.out.printf(" %d짝",i);
				System.out.println();
			}else {
				System.out.printf(" %d",i);
			}
			
		}
	}

}
