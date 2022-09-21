package ch01.quiz02.case02;

public class Orange extends Fruit{

	int price = 2000;
	int num = 20;
	
	@Override
	public void output() {
		String msg = price + "원"+num+"개 ";
		System.out.println(msg);
	}
}
