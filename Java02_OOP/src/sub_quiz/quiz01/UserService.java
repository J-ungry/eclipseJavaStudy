package sub_quiz.quiz01;

import java.util.Scanner;

public class UserService {


	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("0. 프로그램 종료 ");
		System.out.print(">> ");
		
		return sc.nextInt();
	}
	
	public void newUser(User[] u,int count) {
		if(count >= 5) {
			System.out.println("더이상 못만들긔");
			return;
		}
		u[count] = new User();
		System.out.println("Insert ID >>>");
		u[count].id = sc.next();
		System.out.println("Insert Password");
		u[count].password = sc.next();

		System.out.println("저장 완료");
	}
	
	public void login(User[] u, int count) {
		System.out.println("Insert ID >>");
		String inputId = sc.next();
		System.out.println("Insert Password >>");
		String inputPassword = sc.next();
		
		for(int i=0;i<count; i++) {
			if(inputId.equals(u[i].id)) {
				if(inputPassword.equals(u[i].password)) {
					System.out.println("로그인 완료 ");
					return;
				} else {
					System.out.println("비번 틀렸어요");
				}
				
			} 
			}
		System.out.println("아이디 다시 확인 ㄱ");
		return;
			
		}
	}

