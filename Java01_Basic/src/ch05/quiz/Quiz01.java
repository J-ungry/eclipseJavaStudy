package ch05.quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] =  new int[5];
		int input = 0;
		
		for(int i=0; i<5;i++) {
			input = sc.nextInt();
			arr[i] = input;
		}
		for(int i=0; i<5;i++) {
			System.out.println(arr[i]);
		}
	}

}
