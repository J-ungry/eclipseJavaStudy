package ch05.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		//scanner 
		Scanner sc = new Scanner(System.in);
		
		//array
		String name[];
		String nums[];
		
		//input
		String strInput = "";
		int input = 0;
		
		//insert num
		System.out.print("인원수 입력 > ");
		input = sc.nextInt();
		//개행문자 제거 
		sc.nextLine();
		
		//size
		name = new String[input];
		nums = new String[input];
		
		//insert value
		for(int i=0; i<name.length;i++) {
			System.out.print("Insert name > ");
			strInput = sc.nextLine();
			name[i] = strInput;
		
			System.out.print("Insert num > ");
			strInput = sc.nextLine();
			nums[i] = strInput;
			
			System.out.println();
		}
		
		//print
		for(int i=0; i<name.length;i++) {
			System.out.printf("%d : name > %s , number > %s\n",(i+1),name[i],nums[i]);
		}
		
		
		//answer
		System.out.println("Insert num > ");
		int num = sc.nextInt();
		
		String names[] = new String[num];
		String telnum[] = new String[num];
		
		for(int i=0; i<name.length; i++) {
			System.out.println("### "+ (i+1)+" ###");
			System.out.println("이름 입력 : ");
			name[i] = sc.next();
			System.out.println("전화번호 입력 : ");
			telnum[i] = sc.next();
		}
		
		for(int i=0; i<num; i++) {
			System.out.println("### "+ (i+1)+" ###");
			System.out.println("이름 > "+name[i]);
			System.out.println("번호 > "+telnum[i]);
		}
		
		//Enhanced For 문 ( 자료구조 알고리즘 for-each문)
		for(String s : name) {
			System.out.println(s);
		}
		
	}

}
