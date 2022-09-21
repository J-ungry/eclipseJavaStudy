package ch04.ex03.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("단 입력 > ");
			int num= sc.nextInt();
			if(num > 1 && num <= 9) {
				for(int i = 1; i<10;i++) {
					System.out.printf("%d * %d = %d\n",num,i,(num*i));
				}
			}
			else if(num==10) {
				System.out.println("종료");
				return;
				} 
			else {
				System.out.println("안된덩 !"); 
				}
			
			
			}
			
		}
		
	}


