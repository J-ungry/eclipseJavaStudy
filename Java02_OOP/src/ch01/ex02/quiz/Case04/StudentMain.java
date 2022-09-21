package ch01.ex02.quiz.Case04;


public class StudentMain {

	public static void main(String[] args) {

		StudentService ss = new StudentService();
		Student[] s = new Student[ss.studentNum()];
		
		int cnt = 0;
		
		do {
			int menu = ss.menu(); //print menu
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료 ");
				return;
			case 1:
				if(cnt==s.length) {
					System.out.println("더이상 입력 불가능쓰 !!!");
				} else {
					ss.input(s, cnt);
					cnt ++;
				}
				break;
				
			case 2:
				for(int i=0; i<cnt; i++) {
					s[i].output();
				}
				break;
			default:
				System.out.println("잘못된 입력입니다 ");
			}
		}while(true);
	}

}
