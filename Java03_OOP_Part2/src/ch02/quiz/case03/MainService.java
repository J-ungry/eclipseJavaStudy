package ch02.quiz.case03;

public class MainService extends AbstractExam{
	
	UserService us = new UserService();
	MemberService ms = new MemberService();
	
	User[] u = new User[3];
	Member[] m = new Member[3];

	@Override
	public int menu() {
		System.out.println("1. 입력 ");
		System.out.println("2. 출력 ");
		System.out.println("0. 프로그램 종료");
		System.out.print(">>> ");
		
		return sc.nextInt();
	}

	@Override
	public void input(Object[] o) {
		System.out.println("1. 유저 정보 입력 ");
		System.out.println("2. 멤버 정보 입력 ");

		System.out.print(">>>");
		
		int num = sc.nextInt();
		if(num == 1) {
			us.input(u);
		}else if(num==2) {
			ms.input(m);
		}
		
	}

	@Override
	public void output(Object[] o) {
		System.out.println("1. 유저 정보 출력 ");
		System.out.println("2. 멤버 정보 출력 ");
		System.out.print(">>>");
		
		int num = sc.nextInt();
		if(num == 1) {
			us.output(u);
		}else if(num==2) {
			ms.output(m);
		}
	}

}
