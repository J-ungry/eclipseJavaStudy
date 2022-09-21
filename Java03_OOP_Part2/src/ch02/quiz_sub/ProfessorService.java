package ch02.quiz_sub;

import java.util.Scanner;

public class ProfessorService {
	
	Scanner sc = new Scanner(System.in);
	static int pCnt = 0;
	
	public void input(Professor[] p) {
		p[pCnt] = new Professor();
		
		System.out.print("이름 입력 >>>");
		p[pCnt].setpName(sc.next());
		System.out.print("전공 입력 >>>");
		p[pCnt].setMajor(sc.next());
		
		System.out.println("교수정보 입력이 완료 되었습니다 !\n");
		pCnt++;
		
	}

	public void output(Professor[] p) {
		if(pCnt==0) {
			System.out.println("출력할 정보가 없습니다 !\n");
			return;
		}
		for(int i=0; i<pCnt; i++) {
			System.out.println("##### "+p[i].getpName()+"#####");
			System.out.println("전공 >> "+p[i].getMajor());

			
			System.out.println();
		}
	}

	public void modify(Professor[] p) {
		if(pCnt==0) {
			System.out.println("출력 할 정보가 없습니다 !\n");
			return;
		}
		
		System.out.print("수정할 이름 입력 >>>");
		String name = sc.next();
		
		for(int i=0; i<pCnt; i++) {
			if(p[i].getpName().equals(name)) {
				System.out.print("수정할 전공 입력 >>");
				p[i].setMajor(sc.next());
				System.out.println("수정완료 !!!\n");
				return;
			}
		}
		System.out.println("수정 할 이름이 없습니다 !\n");		
	}

	public void delete(Professor[] p) {
		if(pCnt==0) {
			System.out.println("삭제 할 정보가 없습니다 !\n");
			return;
		}
		System.out.print("삭제 할 이름 입력 >>>");
		String name = sc.next();
		
		for(int i=0; i<pCnt; i++) {
			if(p[i].getpName().equals(name)) {
				for(int j=i; j<pCnt-1; j++) {
					p[j] = p[j+1];
				
				}
				pCnt --;
				System.out.println("삭제가 완료되었습니다\n");
				return;
			}
		}
		System.out.println("삭제 할 이름이 없습니다 !\n");
	
	}

		
	



}
