package ch04.ex05.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int random = (int)(Math.random() * 100) +1;
		int input = 0;
		int cnt = 0;
		do {
			System.out.print("> ");
			input = sc.nextInt();
			cnt ++;
			
			if(input > random) {
				System.out.println("Down");
			} else if (input < random) {
				System.out.println("UP");
			}
		} while(input != random);
		
		System.out.printf("%d Times ! Answer : %d",cnt,random);
	}

}
