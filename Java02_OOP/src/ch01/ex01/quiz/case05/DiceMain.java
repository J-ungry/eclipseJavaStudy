package ch01.ex01.quiz.case05;

import java.util.Scanner;

public class DiceMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Dice d = new Dice();
		
		boolean check = true;
		while(check) {
			d.rollDice();
			System.out.println(d.diceNum);
			
			
			boolean midCheck = true;
			while(midCheck) {
				
				String yn = d.ask();
				
				if(yn.equals("Y")||yn.equals("y")) {
					midCheck = false;
				}else if(yn.equals("N")||yn.equals("n")){
					check = false;
					midCheck = false;
				}
					
			
			}
		}
	}

}
