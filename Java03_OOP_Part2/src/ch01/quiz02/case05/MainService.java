package ch01.quiz02.case05;

import java.util.Scanner;

import java.util.ArrayList;


public class MainService {

	Scanner sc = new Scanner(System.in);
	
	int cnt = 0;
	
	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		return sc.nextInt();
	}

	public void input(Member[] m, Score[] s) {
		if (cnt == m.length) {
			System.out.println("입력할 공간이 없습니다.");
		}else {
			m[cnt] = new Member();
			System.out.print("이름 입력: ");
			m[cnt].setName(sc.next());
			System.out.print("나이 입력 : ");
			m[cnt].setAge(sc.nextInt());
			System.out.print("이메일 입력 : ");
			m[cnt].setEmail(sc.next());
			
			s[cnt] = new Score();
			System.out.print("국어 점수 입력 : ");
			s[cnt].setKo(sc.nextInt());
			System.out.print("영어 점수 입력 : ");
			s[cnt].setEn(sc.nextInt());
			System.out.print("수학 점수 입력 : ");
			s[cnt].setMa(sc.nextInt());
			
			s[cnt].setSum();
			s[cnt].setAvg();
		
			cnt++;
		}
	}

	public void output(Member[] m, Score[] s) {
		for (int i=0; i<cnt; i++) {
			System.out.println("### " + m[i].getName() + " ###");
			System.out.println("총점 : " + s[i].getSum());
			System.out.println("평균" + s[i].getAvg());
		}
	}

	public void modify(Member[] m, Score[] s) {
		System.out.println("수정하고 싶은 이름을 입력하세요 >>> ");
		String name = sc.next();
		
		for(int i=0; i<m.length; i++) {
			if(m[i].getName().equals(name)) {
				System.out.println("1. 나이 ,이메일 ");
				System.out.println("2. 성적");
				
				System.out.print("선택 : ");
				int select = sc.nextInt();
				
				if(select == 1) {
					System.out.println("수정할 나이 입력 : ");
					m[i].setAge(sc.nextInt());
					System.out.println("수정할 이메일 입력 : ");
					m[i].setEmail(sc.next());
					
					
				}
				else if(select == 2) {
					System.out.println("수정하고자 하는 국어 점수 >> ");
					s[i].setKo(sc.nextInt());
					System.out.println("수정하고자 하는 영어 점수 >> ");
					s[i].setEn(sc.nextInt());
					System.out.println("수정하고자 하는 수학 점수 >> ");
					s[i].setMa(sc.nextInt());
					
					s[i].setAvg();
					s[i].setSum();
					
				}
				System.out.println("수정이 완료되었습니다");
				return;
				
			}
		System.out.println("검색하고자 하는 이름이 없습니다 !! ");
		return;
		}
		
	}

	public void delete(Member[] m, Score[] s) {
		System.out.println("삭제하고자 하는 아이디 입력 >> ");
		String name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(m[i].getName().equals(name)) {
				
				
				for(int j = i; j<cnt-1; j++) {
					m[j] = m[j+1];
					s[j] = s[j+1];
				}
				cnt --;
				System.out.println("삭제 완료 ");
				return;
			}
		
		}
		
		System.out.println("삭제하고자 하는 이름이 없습니다 !!");
		
	}

}

