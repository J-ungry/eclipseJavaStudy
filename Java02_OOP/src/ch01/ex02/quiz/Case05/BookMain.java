package ch01.ex02.quiz.Case05;

public class BookMain {

	public static void main(String[] args) {

		BookService bs = new BookService();
		Book[] b = new Book[bs.input()]; //책 권수 입력 
		
		while(true) {
			int menu = bs.menu();
			
			switch(menu) {
			case 0: 
				System.out.println("프로그램 종료 ");
				return;
				
			case 1:
				for(int i=0; i<b.length;i++) {
					b[i] = new Book();
					b[i].getBook();
				}
				break;
			case 2:
				for(int i=0; i<b.length; i++) {
					System.out.println(b[i].setBook());
				}
				break;
			default :
				System.out.println("잘못 입력했끠 !!!!");
			}
		}
		
	}

}
