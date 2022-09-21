package ch01.quiz02.case04;

public class SellMain {

	public static void main(String[] args) {
		
		SellService ss = new SellService();
		SellFruit sf = new SellFruit();
		
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				sf = ss.sell(sf);
				break;
			case 2:
				ss.sellInfo(sf);
				break;
			case 3:
				ss.amount();
				break;
			case 4:
				ss.fruitSell();
			default:
				System.out.println("다시 입력해주세요");
			}
		}

	}

}
