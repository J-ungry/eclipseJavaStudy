package ch01.quiz02.case02;

public class Fruit {

	private int price;
	private int num;
	
	public void output() {
		String msg = this.price + "원 "+this.num+"개 ";
		System.out.println(msg);
	}
}
