package ch01.ex01.quiz.case02;

import java.time.LocalDate;

public class OrderInfoTest {

	public static void main(String[] args) {
		OrderInfo order = new OrderInfo();
		
		order.registNum = 1001;
		order.phoneNum = "010-1111-2222";
		order.address = "서울시 강남구 역삼동 111";
		order.price = 350_000;
		order.menuNum = 0003;
		
		order.showInfo();
		
	}

}
