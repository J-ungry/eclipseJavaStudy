package ch01.quiz02.case01;

import java.util.Scanner;

public class ScoreService {

	Scanner sc = new Scanner(System.in);
	static int count =0;
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("0. 프로그램 종료 ");
		System.out.print(">>>");
		int num = sc.nextInt();
		
		return num;
	}
	
	public void input(ScoreChild[] schild) {
		if(count == 5) {
			System.out.println("더이상 추가 불가능 ");
			return;
		}
		schild[count] = new ScoreChild();
		System.out.println("이름 입력 >> ");
		schild[count].setName(sc.next());
		
		System.out.println("국어 입력 >> ");
		schild[count].setKor(sc.nextInt());
		
		System.out.println("수학 입력 >> ");
		schild[count].setMath(sc.nextInt());
		
		System.out.println("영어 입력 >> ");
		schild[count].setEng(sc.nextInt());
		
		System.out.println("음악 입력 >> ");
		schild[count].setMusic(sc.nextInt());
		
		System.out.println("체육 입력 >> ");
		schild[count].setPe(sc.nextInt());
		
		schild[count].setTotal();
		schild[count].setAvg();
		
		System.out.println("입력이 완료되었습니다 ");
		count ++;
		
		
	}
	public void output(ScoreChild[] schild) {
		if(count == 0) {
			System.out.println("출력할 내용이 없습니다");
			return;
		}
		for(int i=0; i<count; i++) {
//			System.out.println("이름 >> "+schild[i].getName());
//			int total = schild[i].getTotal();
//			System.out.println("총점 >> "+total);
//			System.out.println("평균 >> "+schild[i].getAvg());
//			
//			System.out.println();
			System.out.println(schild[i].toString());
		}
		
	}

}
