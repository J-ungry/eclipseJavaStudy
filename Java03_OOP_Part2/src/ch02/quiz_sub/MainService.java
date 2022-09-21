package ch02.quiz_sub;

import java.util.Scanner;

public class MainService {
	
	Scanner sc = new Scanner(System.in);
	ScoreService ss = new ScoreService();
	ProfessorService ps = new ProfessorService();

	public int menu() {
		System.out.println("===== MENU =====");
		System.out.println("1. INPUT");
		System.out.println("2. OUTPUT");
		System.out.println("3. MODIFY");
		System.out.println("4. DELETE");
		System.out.println("0. END THE PROGRAM");
		System.out.print(">> ");
		return sc.nextInt();
	}

	public void input(Score[] s, Professor[] p) {
		System.out.println("1. 성적 입력 ");
		System.out.println("2. 교수 입력");
		System.out.print(">> ");
		int num = sc.nextInt();
		
		if(num==1) {
			ss.input(s);
		}else if(num ==2) {
			ps.input(p);
		}
	}
	
	public void output(Score[] s, Professor[] p) {
		System.out.println("1. 성적 출력 ");
		System.out.println("2. 교수 출력");
		System.out.print(">> ");
		int num = sc.nextInt();
		
		if(num==1) {
			ss.output(s);
		}else if(num ==2) {
			ps.output(p);
		}
	}
	
	public void modify(Score[] s, Professor[] p) {
		System.out.println("1. 성적 수정 ");
		System.out.println("2. 교수 수정 ");
		System.out.print(">> ");
		int num = sc.nextInt();
		
		if(num==1) {
			ss.modify(s);
		}else if(num ==2) {
			ps.modify(p);
		}
	}
	
	public void delete(Score[] s, Professor[] p) {
		System.out.println("1. 성적 삭제 ");
		System.out.println("2. 교수 삭제");
		System.out.print(">> ");
		int num = sc.nextInt();
		
		if(num==1) {
			ss.delete(s);
		}else if(num ==2) {
			ps.delete(p);
		}
	}
	
	

}
