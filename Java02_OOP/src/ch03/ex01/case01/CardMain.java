package ch03.ex01.case01;

public class CardMain {

	public static void main(String[] args) {

		Card c1 = new Card();
		c1.shape = "heart";
		c1.number = 7;
		c1.width = 5;
		c1.height = 10; //접근은 가능 하지만 
		
		System.out.println(c1.shape+" "+c1.number);
		System.out.println(c1.width+" "+c1.height);
		
		Card c2 = new Card();
		c2.shape = "spade";
		c2.number = 5;
		Card.width = 20;
		Card.height= 30;
		
		
		System.out.println(c2.shape+" "+c2.number);
		System.out.println(c1.width+" "+c1.height); //c1 으로 했는데도 !!!!! 바뀌었다 !!!! 이상한 일이야 !!!!! 서로 다 공유하는 메모리 영역이다 
	}

}
