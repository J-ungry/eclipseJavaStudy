package ch01.quiz02.case07;

import java.util.Scanner;



public class UserService {
	
	Scanner sc = new Scanner(System.in);
	UserChild2[] uc = new UserChild2[3];
	int cnt = 0;
	

	public int menu() {
		
		System.out.println("### 메뉴 ###");
		System.out.println("1. 입력 ");
		System.out.println("2. 출력 ");
		System.out.println("0. 프로그램 종료 ");
		System.out.print(">>>> ");
		return sc.nextInt();
		
	}


	public void input() {
		if(cnt == uc.length) {	
			System.out.println("더이상 입력할 수 없습니다 ");
			return;
		}

		uc[cnt] = new UserChild2();
		System.out.println("아이디 입력하기");
		uc[cnt].setId(sc.next());
		System.out.println("패스워드 입력하기");
		uc[cnt].setPw(sc.next());
		System.out.println("이름 입력하기");
		uc[cnt].setName(sc.next());
		System.out.println("이메일 입력하기");
		uc[cnt].setEmail(sc.next());
		System.out.println("나이 입력하기");
		uc[cnt].setAge(sc.nextInt());
		
		cnt ++;
	}
	
	public void output() {
		if(cnt ==0) {
			System.out.println("출력할 데이터가 없습니다  ");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("아이디 >> "+uc[i].getId());
			System.out.println("패스워드 >> "+uc[i].getPw());
			System.out.println("이름 >> "+uc[i].getName());
			System.out.println("이메일 >> "+uc[i].getEmail());
			System.out.println("나이 >> "+uc[i].getAge());
			System.out.println();
		}
		
	}

}
