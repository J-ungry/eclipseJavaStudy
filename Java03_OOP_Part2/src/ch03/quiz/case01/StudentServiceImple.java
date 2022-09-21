package ch03.quiz.case01;

import java.util.Scanner;

public class StudentServiceImple implements StudentService{
	
	int cnt = 0;
	Scanner sc = new Scanner(System.in);
	
	Student[] s = new Student[5];

	@Override
	public int menu() {
		System.out.println("####메뉴 선택####");
		System.out.println("1. INPUT");
		System.out.println("2. OUTPUT");
		System.out.println("3. MODIFY");
		System.out.println("4. DELETE");
		System.out.println("0. END THE PROGRAM");
		return sc.nextInt();
	}

	@Override
	public void input() {
		if(cnt == s.length) {
			System.out.println("Cannot input ! It's already full !");
			return;
		}
		s[cnt] = new Student();
		
		System.out.print("Insert name >>");
		s[cnt].setName(sc.next());
		System.out.print("Insert Age >> ");
		s[cnt].setAge(sc.nextInt());
		System.out.print("Insert Major >> ");
		s[cnt].setMajor(sc.next());
		System.out.println("Complete ! ");
		cnt ++;
		
	}

	@Override
	public void output() {
		if(cnt ==0) {
			System.out.println("Cannot output ! It's empty");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("#### "+s[i].getName()+" ####");
			System.out.println("AGE : "+s[i].getAge());
			System.out.println("Major : "+s[i].getMajor());
			System.out.println();
		}
		
	}

	@Override
	public void modify() {
		if(cnt == 0) {
			System.out.println("Cannot output ! It's empty");
			return;
		}
		
		System.out.print("수정하고 싶은 이름을 입력하세요 >> ");
		String name= sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(name.equals(s[i].getName())){
				System.out.print("수정하고 싶은 전공을 입력하세여 >> ");
				s[i].setMajor(sc.next());
				System.out.println("수정 완료 !");
				return;
			}
		}
		
	}

	@Override
	public void delete() {
		if(cnt == 0) {
			System.out.println("Cannot output ! It's empty");
			return;
		}
		
		System.out.print("삭제하고 싶은 이름을 입력하세요 >> ");
		String name= sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(name.equals(s[i].getName())){
				for(int j =i; j<cnt-1; j++) {
					s[j] = s[j+1];
				}
				cnt --;
				System.out.println("삭제 완료띵 ");
				return;
			}
		}
		
	}

}
