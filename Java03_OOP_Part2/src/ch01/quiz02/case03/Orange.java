package ch01.quiz02.case03;

public class Orange extends Fruit{

	String name = "Orange";
	int price = 2000;
	int num = 20;
	
	public int getPrice() {
		return price;
	}
	
	public int getNum() {
		return num;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void output() {
		System.out.println("### 오렌지 ###");
		System.out.println("수량 : "+num);
	}
}
