package ch04.ex05.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		for(int i=1;i<101;i++) {
			if(i%3!=0) continue;
			System.out.println(i);
		}
	}

}
