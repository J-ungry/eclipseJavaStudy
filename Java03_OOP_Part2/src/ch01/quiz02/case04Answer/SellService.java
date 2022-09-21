package ch01.quiz02.case04Answer;

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
		System.out.println("0. 프로그램 종료 ");
		System.out.printf(">>>");
		return sc.nextInt();
	}

	public SellFruit[] sell(SellFruit[] sf) {
		
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
		System.out.println("work");
		sf[fruitType-1].setTotalNum(fruitNum);
		sf[fruitType-1].setTotalPrice((f[fruitType-1].getPrice()) * fruitNum);
		f[fruitType-1].setNum(f[fruitType-1].getNum()-fruitNum);

		return sf;

	}




	public void sellInfo(SellFruit[] sf) {
		for(SellFruit x : sf) {
			System.out.println("### 과일  ###"); //이거 걍 배열 받아서 바꾸면 됨 
			System.out.println(x.getTotalNum());
			System.out.println(x.getTotalPrice());
		}
		

		
	}


	public void amount() {
		for(int i=0 ; i<f.length; i++) {
			f[i].output();
		}	
	}
}
