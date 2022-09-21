package ch04.ex04;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		// 1. 조건식에 true 값 넣기 
		while(true) {
			System.out.println("a");
			break;
//			return;  여기에 적으면 프로그램 종료이기 때문에 그 밑에 쓰는건 의미가 없다 
		}
		
		//2. boolean type
		boolean b1 = true;
		int i =0;
		while(b1) {
			System.out.println("b");
			i++;
			if(i==5) b1 = false;
		}
		
		//3. 특정조건을 종료 조건으로 
		while(!(i==100)) {
			i++;
			System.out.println(i);
		}
		
		i=0;
		Scanner sc = new Scanner(System.in);
		
		while(!(i==10)) {
			System.out.print("입력 > ");
			i = sc.nextInt();
		}
	}

}
