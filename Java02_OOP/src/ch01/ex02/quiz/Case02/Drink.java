package ch01.ex02.quiz.Case02;

public class Drink {

	String name;
	int totalNum;
	int totalPrice;
	
	
	void output() {
		System.out.printf("---%s---\n",name);
		System.out.printf("총 판매 수량 : %d\n",totalNum);
		System.out.printf("총 판매 금액 : %d\n",totalPrice);
	}
}
