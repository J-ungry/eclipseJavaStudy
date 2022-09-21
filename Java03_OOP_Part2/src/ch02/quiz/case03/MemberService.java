package ch02.quiz.case03;

public class MemberService extends AbstractExam{

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
		Member m = new Member();
		System.out.print("이름 입력하기 >>> ");
		m.setName(sc.next());
		System.out.print("이메일 입력하기 >>>");
		m.setEmail(sc.next());
		
		o[cnt] = m;
		cnt ++;
	}

	@Override
	public void output(Object[] o) {
		Member[] m = (Member[]) o;
		
		if(cnt ==0) {
			System.out.println("출력할게 없어요");
			return;
		}
		for(int i=0; i<cnt; i++) {
			System.out.println("Name >>"+m[i].getName());
			System.out.println("Email >> "+m[i].getEmail());
			System.out.println();
		}
	}

}
