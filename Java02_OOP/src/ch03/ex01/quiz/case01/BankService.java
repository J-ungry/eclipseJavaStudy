package ch03.ex01.quiz.case01;

import java.util.Scanner;

public class BankService {

	Scanner sc = new Scanner(System.in);
	
	static int cnt = 0;
	
	public int menu() {
		
		System.out.println("#### Menu ####");
		System.out.println("1. 계좌등록 ");
		System.out.println("2. 계좌출력 ");
		System.out.println("0. 프로그램 종료 ");
		
		System.out.printf(">> ");
		return sc.nextInt();
	}
	
	public void input(Bank[] b) {
		if(cnt == b.length) {
			System.out.println("더 이상 입력할 수 없습니다.");
		} else {
			b[cnt] = new Bank();
			System.out.print("계좌 번호 입력 : ");
			b[cnt].setAccountNum(sc.next());
			System.out.print("잔액 입력 : ");
			b[cnt].setBalance(sc.nextInt());
			System.out.print("이자율 입력 : ");
			
			b[cnt].setRate(sc.nextDouble());
			cnt ++;
		}
	}
	
	public void output(Bank[] b) {
		if(cnt==0) {
			System.out.println("출력 할 계좌가 없습니다");
		}else {
			for(int i=0; i<cnt; i++) {
				System.out.print(b[i]);
			}
		}
	}

}
