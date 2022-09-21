package ch01.quiz02.case04;

import java.util.Scanner;

public class SellService {

	Scanner sc = new Scanner(System.in);
	Fruit[] f = new Fruit[3];
	
	public SellService() {
		f[0] = new Banana();
		f[1] = new Apple();
		f[2] = new Orange();
	}
	

	
	
	public int menu() {
		System.out.println("###메뉴###");
		System.out.println("1. 판매 ");
		System.out.println("2. 매출 정보 보기");
		System.out.println("3. 재고 보기 ");
		System.out.println("4. 각 과일별 매출 정보 보기");
		System.out.println("0. 프로그램 종료 ");
		System.out.printf(">>>");
		return sc.nextInt();
	}

	public SellFruit sell(SellFruit sf) {
		
		System.out.println("1. 바나나");
		System.out.println("2. 사과");
		System.out.println("3. 오렌지");
		System.out.printf("과일 선택 >>>");
		
		int fruitType = sc.nextInt();
		
		System.out.printf("개수 입력 >>>  ");
		int fruitNum = sc.nextInt();
		
		if(f[fruitType-1].getNum()-fruitNum < 0) { //개수 부족할 때 
			System.out.println("개수가 부족합디다");
			return sf;
		}
		sf.setTotalNum(fruitNum);
		sf.setTotalPrice((f[fruitType-1].getPrice()) * fruitNum);
		f[fruitType-1].setNum(f[fruitType-1].getNum()-fruitNum);
		f[fruitType-1].setAmount(fruitNum);
		f[fruitType-1].setTotal((f[fruitType-1].getPrice()) * fruitNum);
		

		return sf;

	}

	public void sellInfo(SellFruit sf) {
		System.out.println("### 매출 정보 보기 ###");
		System.out.println("총 판매 금액 : "+ sf.getTotalPrice());
		System.out.println("총 판매 개수 : "+ sf.getTotalNum());
		
	}


	public void amount() {
		for(int i=0 ; i<f.length; i++) {
			f[i].output();
		}	
	}




	public void fruitSell() {
		for(int i=0; i<f.length; i++) {
			System.out.println("과일 이름 : " + f[i].getName());
			System.out.println("판매 개수 : "+f[i].getAmount());
			System.out.println("총 판매 금액 : "+f[i].getTotal());
			System.out.println();
		}

		
	}
}
