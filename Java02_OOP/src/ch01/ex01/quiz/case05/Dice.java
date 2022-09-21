package ch01.ex01.quiz.case05;

import java.util.Scanner;

public class Dice {

	int diceNum;
	
	void rollDice() {
		diceNum = (int)(Math.random()*6)+1;
	}
	
	String ask() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("주사위를 굴릴까요 ? (y,n) >");
		return sc.next();
	}
}
