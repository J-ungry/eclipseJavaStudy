package ch05;

import java.util.Scanner;

public class C05Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int nums[];
		
		System.out.println("배열의 크기 입력 : ");
		int size = sc.nextInt();
		
		nums = new int[size];
		
		//배열의 크기를 알 때
		for(int i =0; i<size; i++) {
			
		}
		
		//배열의 크기를 모를 때 
		System.out.println(nums.length); //.은 객체에 접근하는건데 배열은 객체이기 때문에 사용할 수 있
		for(int i=0; i<nums.length;i++) {
			
		}
	}

}
