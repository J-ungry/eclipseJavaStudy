package ch01.ex03.quiz.Case02Answer;

import java.util.Scanner;

public class ScoreService {

	Scanner sc = new Scanner(System.in);
	static int cnt = 0;
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력 ");
		System.out.println("0. 프로그램 종료");
		
		System.out.print("선택 : ");
		return sc.nextInt();
	}
	
	public int input(Score[] s) {
		if(cnt ==s.length) {
			System.out.println("더 이상 입력 불가능쓰 ! ");
		}else {
			s[cnt] = new Score();
			System.out.print("이름 입력 > ");
			s[cnt].setName(sc.next());
			System.out.print("국어 점수 입력 > ");
			s[cnt].setKor(sc.nextInt());
			System.out.print("영어 점수 입력 > ");
			s[cnt].setEng(sc.nextInt());
			System.out.print("수학 점수 입력 > ");
			s[cnt].setMath(sc.nextInt());
			s[cnt].setTotal();
			s[cnt].setAvg();
			cnt ++;
		}
		return cnt;
	}
	
	public void output(Score[] s) {
		if(cnt==0) {
			System.out.println("출력 할 내용이 없습니다. ");
		}else {
			for(int i=0; i<cnt; i++) {
				System.out.println("###" + s[i].getName() + "###");
				System.out.println("Total >> "+s[i].getTotal());
				System.out.println("Avg >> "+s[i].getAvg());
			}
		}
	}
}

