package ch01.quiz02.case02;

public class Banana extends Fruit{

	int price = 1000;
	int num = 10;
	
	@Override
	public void output() {
		String msg = price + "원 "+num+"개 ";
		System.out.println(msg);
	}
}
