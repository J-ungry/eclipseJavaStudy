package ch03.ex01;

public class C05Random {

	public static void main(String[] args) {

		//Math.random() 사용해 1 이상 10미만의 정수값 출력
		int d = (int)(Math.random() * 10)+1; //타입이 일치해야하므로 double
		
		System.out.println(d);
		
		
	}

}
