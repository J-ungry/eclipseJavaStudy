package ch03.quiz.case04.presentation;

import java.util.Scanner;

public class Console {

	Scanner sc = new Scanner(System.in);
	
	public void showInfo(String message) {
		System.out.println(message);
	}
	
	public static void showInfo(Object obj) {
		System.out.println(obj);
	}
}
