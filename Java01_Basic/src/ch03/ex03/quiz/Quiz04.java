package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert x");
		int x = sc.nextInt();
		
		System.out.println("Insert y");
		int y = sc.nextInt();
		
		int resultX = (x>=0)?x:(x*-1);
		int resultY = (y>=0)?y:(y*-1);
		
		System.out.printf("x의 절대값 : %d\n",resultX);
		System.out.printf("y의 절대값 : %d",resultY);
	}

}
