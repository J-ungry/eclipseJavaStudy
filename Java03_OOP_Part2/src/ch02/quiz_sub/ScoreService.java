package ch02.quiz_sub;

import java.util.Scanner;

public class ScoreService {
	
	Scanner sc = new Scanner(System.in);
	static int sCnt=0;

	public void input(Score[] s) {
		s[sCnt] = new Score();
		
		System.out.print("이름 입력 >>>");
		s[sCnt].setName(sc.next());
		System.out.print("전공 입력 >>>");
		s[sCnt].setMajor(sc.next());
		System.out.print("성적 입력 >>>");
		s[sCnt].setScore(sc.nextInt());
		
		System.out.println("성적 입력이 완료 되었습니다 !\n");
		sCnt++;
		
	}

	public void output(Score[] s) {
		if(sCnt==0) {
			System.out.println("출력할 정보가 없습니다 !\n");
			return;
		}
		for(int i=0; i<sCnt; i++) {
			System.out.println("##### "+s[i].getName()+"#####");
			System.out.println("전공 >> "+s[i].getMajor());
			System.out.println("성적 >> "+s[i].getScore());
			
			System.out.println();
		}
	}

	public void modify(Score[] s) {
		if(sCnt==0) {
			System.out.println("출력할 정보가 없습니다 !\n");
			return;
		}
		
		System.out.print("수정할 이름 입력 >>>");
		String name = sc.next();
		
		for(int i=0; i<sCnt; i++) {
			if(s[i].getName().equals(name)) {
				System.out.print("수정할 점수 입력 >>");
				s[i].setScore(sc.nextInt());
				return;
			}
		}
		System.out.println("수정 할 이름이 없습니다 !\n");
	}

	public void delete(Score[] s) {
		if(sCnt==0) {
			System.out.println("출력할 정보가 없습니다 !\n");
			return;
		}
		System.out.print("삭제 할 이름 입력 >>>");
		String name = sc.next();
		
		for(int i=0; i<sCnt; i++) {
			if(s[i].getName().equals(name)) {
				for(int j=i; j<sCnt-1; j++) {
					s[j] = s[j+1];
				
				}
				sCnt --;
				System.out.println("삭제가 완료되었습니다\n");
				return;
			}
		}
		System.out.println("삭제 할 이름이 없습니다 !\n");
	
	}

}
