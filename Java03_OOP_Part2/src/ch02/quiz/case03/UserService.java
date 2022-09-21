package ch02.quiz.case03;

public class UserService extends AbstractExam{

	@Override
	public int menu() {
		// 비워놓는다 !!!
		return 0;
	}

	@Override
	public void input(Object[] o) {
		if(cnt == o.length) {
			System.out.println("더이상 입력할 수 없습니다 ");
			return;
		}
		User u = new User();
		System.out.print("아이디 입력하기 >>> ");
		u.setId(sc.next());
		System.out.print("비밀번호 입력하기 >>>");
		u.setPw(sc.next());
		
		o[cnt] = u;
		cnt ++;
		
	}

	@Override
	public void output(Object[] o) {
		User[] u = (User[]) o;
		
		if(cnt==0) {
			System.out.println("출력할게 없어용");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("ID >>" + u[i].getId());
			System.out.println("PW >>" + u[i].getPw());
			System.out.println();
		}
		
	}

}
