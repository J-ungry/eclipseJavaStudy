package ch02.quiz.case02;

public class FruitMain {

	public static void main(String[] args) {
		
		Fruit[] f = new Fruit[5];
		
		FruitService fs = new FruitService();

		while(true) {
			int menu = fs.menu();
			
			switch(menu){
			case 0:
				System.out.println("프로그램 종료 ");
				return;
				
			case 1:
				fs.input(f);
				break;
			case 2:
				fs.output(f);
				break;
			case 3:
				fs.modify(f);
				break;
			case 4:
				fs.delete(f);
				break;
			default:
				System.out.println("잘못된 입력입니다 다시 하세용");
			}
		}
	}

}
