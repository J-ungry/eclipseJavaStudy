package ch04.ex05.quiz;

import java.util.Scanner;

public class Quiz04_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String check ="y";
		String n1,n2; //숫자가 될 녀석들 
		String oper;
		
		boolean a=true, b=true ,c = true, d=true; //정상적인 입력을 판별하기 위한 변수 
		
		do {
			//n1 입력에 대한 처리 
			do {
				System.out.print("숫자 1 > ");
				n1 = sc.nextLine();
				if(n1.length()==1 && n1.charAt(0) >'0' && n1.charAt(0) <='9') {
					a = false;
				}else System.out.println("한자리 자연수를 입력하세요");
			}while(a == true);
			
			//연산자 oper에 대한 처리
			do {
				System.out.print("연산자 > ");
				oper = sc.nextLine();
				
//				if(oper.length()!=1 || oper.charAt(0)!='+' || oper.charAt(0)!='-' || oper.charAt(0)!='*' || oper.charAt(0)!='/') {
//					System.out.println("+,-,*,/ 중에 입력하세요 ! ");
//				} else b=false;
//				
				if(oper.charAt(0)=='+'|| oper.charAt(0)=='-' || oper.charAt(0)=='*'|| oper.charAt(0) =='/' ) {
					b = false;
				} else System.out.println("+,-,*,/ 중에 입력하세요 ! ");
			}while(b==true);
			
			
			//n2 입력에 대한 처리
			do {
				System.out.print("숫자 2 > ");
				n2 = sc.nextLine();
				if(n2.length()==1 && n2.charAt(0) >'0' && n2.charAt(0) <='9') {
					c = false;
				}else System.out.println("한자리 자연수를 입력하세요");
			}while(c == true);
			
			int num1 = Integer.parseInt(n1);
			int num2 = Integer.parseInt(n2);
			
			switch(oper.charAt(0)) {
			case '+':
				System.out.printf("%d + %d = %d\n",num1,num2,(num1+num2));
				break;
			case '-':
				System.out.printf("%d - %d = %d\n",num1,num2,(num1-num2));
				break;
			case '*':
				System.out.printf("%d * %d = %d\n",num1,num2,(num1*num2));
				break;
			case '/':
				System.out.printf("%d / %d = %d\n",num1,num2,(num1/num2));
				break;
			
			
			}
			do {
				System.out.print("계속 할까요 ? Y/N >  ");
				check = sc.nextLine();
				

				if(check.charAt(0)=='Y'|| check.charAt(0)=='y' || check.charAt(0)=='N'|| check.charAt(0) =='n' ) {
					d= false;
				} else System.out.println("y 혹은 n 중에 입력하세요 ! ");
			}while(d==true);
			
			
			
			
		}while(check.charAt(0)!='n' && check.charAt(0)!='N');
	}

}
