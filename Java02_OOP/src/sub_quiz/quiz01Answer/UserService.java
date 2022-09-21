package sub_quiz.quiz01Answer;

import java.util.Scanner;

public class UserService {
	
	Scanner sc = new Scanner(System.in);
	static int count = 0;

	public int menu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("0. 프로그램 종료 ");
		System.out.print(">> ");
		
		return sc.nextInt();
	}
	
	public void signUp(User[] u) {
		if(count== u.length) {
			System.out.println("더이상 회원가입 노노");
		}else {
			System.out.println("아이디 입력하기 >> ");
			String id = sc.next();
			
			for(int i=0; i<count; i++) {
				if(id.equals(u[i].id)) {
					System.out.println("이미 동일한 아이디가 존재합니다");
					return;
				}
				}
			u[count] = new User();
			u[count].id = id;
			
			System.out.println("비밀번호를 입력하세요 >> ");
			u[count].pw = sc.next();
			
			count++;
			}
		}
	
	public void login(User[] u) {
		System.out.println("로그인 할 아이디 입력 >>> ");
		String id = sc.next();
		System.out.println("로그인 할 패스워드 입력");
		String pw = sc.next();
		
		for(int i=0; i<count; i++) {
			if(id.equals(u[i].id) && pw.equals(u[i].pw)) {
				System.out.println("로그인 성공");
				System.out.print(id+"님 환영쓰 ㅋㅋ");
				break;
			}
			if(count-1 ==i) { //다 돌았는데도 break 에 안걸렸을ㄸㅐ 
				System.out.println("로그인 실패 ");
			}
		}
	}
	}
	

