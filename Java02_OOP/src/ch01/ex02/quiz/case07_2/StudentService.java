package ch01.ex02.quiz.case07_2;

import java.util.Scanner;


public class StudentService {
	Scanner sc = new Scanner(System.in);

	public int menu() {
		System.out.println("1. 입력");
		System.out.println("2. 출력");
		System.out.println("3. 수정");
		System.out.println("4. 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 >> ");
		int num = sc.nextInt();
		return num;
	}
	
	public int input(int cnt,Student[] s) {
		if(cnt ==3) {
			System.out.println("더이상 저장 할 수 없습니다 ");
		}else {
			s[cnt] = new Student();
			//System.out.print("학번 입력 >> ");
//			s[cnt].studentId = s[cnt].studentId;
			System.out.println(s[cnt].studentId + "학번");
			System.out.print("이름 입력 >> ");
			s[cnt].name = sc.next();
			System.out.print("전공 입력 >> ");
			s[cnt].major = sc.next();
//			s[cnt].studentId++;
			
			cnt ++;
		}
		return cnt;
	}
	
	public void output(int cnt,Student[] s) {
		if(cnt==0){
			System.out.println("출력 할 내용이 없어용가링 ~ ");
		} else {
			for(int i=0; i<cnt; i++) {
				System.out.println("학번 : "+s[i].studentId);
				System.out.println("이름 : "+s[i].name);
				System.out.println("전공 : "+s[i].major);
			}
		}
	}
	
	public void modify(int cnt,Student[] s) {
		System.out.print("수정 할 학번 입력 >>");
		int hakbeon = sc.nextInt();
		for(int i=0; i<cnt; i++) {
			if(hakbeon == s[i].studentId) {
				System.out.print("수정 할 전공 입력 >>");
				s[i].major = sc.next();
				break;
			}
			if(i==(cnt-1)) {
				System.out.println("찾으시는 학번이 없습니다.");
			}
		}
	}
	
	public int delete(int cnt, Student[] s) {
		System.out.print("삭제할 학번 입력 >>");
		int hakbeon = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			if(hakbeon==s[i].studentId) {
				System.out.println(hakbeon +"님의 점수가 삭제되었습니다 .");
				cnt--;
				for(int j=i;j<cnt; j++) {
					s[j] = s[j+1];
				}
				break;
			}
			if(i==(cnt-1)) {
				System.out.println("찾으시는 이름이 없습니다. ");
			}
		}
		return cnt;
	}

}
