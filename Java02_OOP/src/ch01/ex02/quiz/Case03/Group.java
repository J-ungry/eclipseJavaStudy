package ch01.ex02.quiz.Case03;

import java.util.Scanner;

public class Group {
	
	Scanner sc = new Scanner(System.in);

	String groupName;
	int member;
	String song;
	
	
	public void input() {
			System.out.printf("그룹명 입력 > ");
			groupName = sc.next();
			System.out.printf("그룹 인원 입력 > ");
			member = sc.nextInt();
			System.out.printf("그룹 대표곡 입력 > ");
			song = sc.next();
	}
	
	public void output(int i) {
		System.out.printf("### %d ###\n",(i+1));
		System.out.printf("그룹 명  > %s\n",groupName);
		System.out.printf("그룹 인원  > %d\n",member);
		System.out.printf("그룹 대표곡  > %s\n",song);
		System.out.println();
	}
}
