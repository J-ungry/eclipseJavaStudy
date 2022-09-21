package ch01.quiz02.case05;

public class Main {
	public static void main(String[] args) {
		
		Member[] m = new Member[5];
		Score[] s = new Score[5];
		MainService ms = new MainService();
		
		while(true) {
			int menu = ms.menu();
			
			switch(menu) {
			case 1:
				ms.input(m, s);
				break;
			case 2:
				ms.output(m, s);
				break;
			case 3:
				ms.modify(m, s);
				break;
			case 4:
				ms.delete(m, s);
				break;
			case 0:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
