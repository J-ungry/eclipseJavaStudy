package ch01.ex01.quiz.case02;

import java.time.LocalDate;
import java.time.LocalTime;

public class OrderInfo {

	int registNum;
	String phoneNum;
	String address;
	LocalDate orderDate = LocalDate.now();
	LocalTime orderTime = LocalTime.now();
	int price;
	int menuNum;

	void showInfo() {
		System.out.println("주문 접수 번호 > "+registNum);
		System.out.println("주문 전화 번호 > "+phoneNum);
		System.out.println("주문 주소 > "+address);
		System.out.println("주문 날짜  > "+orderDate);
		System.out.println("주문 시간 > "+orderTime);
		System.out.println("주문 가격 > "+ price);
		System.out.println("메뉴 번호 > " + menuNum);
		
	}
	
}
