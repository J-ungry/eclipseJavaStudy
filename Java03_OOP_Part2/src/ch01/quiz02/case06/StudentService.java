package ch01.quiz02.case06;

import java.util.Scanner;

public class StudentService {
	
	Scanner sc = new Scanner(System.in);
	StudentChild[] sChild = new StudentChild[3];
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
		if(cnt == 2) {	
			System.out.println("더이상 입력할 수 없습니다 ");
			return;
		}
		sChild[cnt] = new StudentChild();
		System.out.println("학번 입력하기");
		sChild[cnt].setStudentId(sc.nextInt());
		System.out.println("이름 입력하기");
		sChild[cnt].setName(sc.next());
		System.out.println("전공 입력하기");
		sChild[cnt].setMajor(sc.next());
		System.out.println("성별 입력하기");
		sChild[cnt].setGender(sc.next());
		System.out.println("나이 입력하기");
		sChild[cnt].setAge(sc.nextInt());
		
		cnt ++;
	}


	public void output() {
		for(int i=0; i<cnt; i++) {
			System.out.println("학번 >> "+sChild[i].getStudentId());
			System.out.println("이름 >> "+sChild[i].getName());
			System.out.println("전공 >> "+sChild[i].getMajor());
			System.out.println("성별 >> "+sChild[i].getGender());
			System.out.println("나이 >> "+sChild[i].getAge());
			System.out.println();
		}
		
	}
	
	
}
