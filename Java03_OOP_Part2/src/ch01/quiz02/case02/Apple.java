package ch01.quiz02.case02;

public class Apple extends Fruit{

	int price= 1500;
	int num = 5;
	
	@Override
	public void output() {
		String msg = price + "원 "+num+" 개 ";
		System.out.println(msg);
	}
}
