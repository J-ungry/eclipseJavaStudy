package ch04.ex04.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int sum = 0;
		int num = sc.nextInt();
		
		while(num != 0) {
			
			sum += num%10;
			num = num/10;
			cnt+=1;
			
		}
		System.out.printf("총합 : %d\n자릿수 : %d",sum,cnt);
	}

}
