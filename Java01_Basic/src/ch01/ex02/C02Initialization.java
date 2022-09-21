package ch01.ex02;

public class C02Initialization {

	public static void main(String[] args) {

		int salary;
		int basicPay= 6_000; //숫자에서 1000단위 구분기호로 _ 쓸 수 있다
		int bonus = 5_000;
		
		salary = basicPay + bonus;
		
		//초기화 하지 않은 변수는 메모리에서 값을 읽을 수 없다. 
		System.out.println(salary);
	}

}
