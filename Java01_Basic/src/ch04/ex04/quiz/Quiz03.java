package ch04.ex04.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		
		int cnt = 0;
		int random = 1;
		int sum = 0;
		
		while(sum < 30000) {
			random = (int)(Math.random()*10 + 1) * 1000;
			System.out.println(random);
			cnt ++;
			sum += random;
		}
		System.out.printf("count : %d\nsum : %d",cnt,sum);
	}

}
