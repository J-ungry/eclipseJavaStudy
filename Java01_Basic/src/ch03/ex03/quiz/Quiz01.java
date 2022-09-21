package ch03.ex03.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String result;
		
		result = (num % 2 ==0) ? "짝수" : "홀수";
		
		System.out.printf("%d 는 %S 입니다 ",num,result);
	}

}
