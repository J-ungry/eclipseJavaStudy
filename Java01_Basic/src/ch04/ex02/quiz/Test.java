package ch04.ex02.quiz;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	      System.out.println("가위 바위 보를 해봐요!");
	      // 입력
	      System.out.println("1. 가위 2. 바위 3.보");
	      System.out.print(">");

	      int me = sc.nextInt();
	      int app= (int) (Math.random()*3)+1;
	      String result = "";
	      String choice = "";
	      
	      if(1<= me && app <=3) {
	         
	         // 처리
	         switch(me - app) {
	         case -2: case 1:
	            result = "You Win"; break;
	         case -1: case 2:
	            result = "You Lose . . ."; break;
	         case 0:
	            result = "Draw.";
	         }
	         
	         // 출력
	         switch(me) {
	         case 1:
	            choice = "가위"; break;
	         case 2:
	            choice = "바위"; break;
	         case 3:
	            choice = "보"; break;
	         }
	         System.out.println("You : " + choice);
	         
	         switch(app) {
	         case 1:
	            choice = "가위"; break;
	         case 2:
	            choice = "바위"; break;
	         case 3:
	            choice = "보"; break;
	         }
	         System.out.println("App : " + choice);
	      }
	      else {
	         System.out.println("입력 오류입니다.");
	      }
	      
	      System.out.println(result);
	      
	   }   


}

