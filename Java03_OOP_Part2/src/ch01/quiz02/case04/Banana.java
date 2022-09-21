package ch01.quiz02.case04;

public class Banana extends Fruit{

	String name = "Banana";
	int price = 1000;
	int num = 10;
	private int amount;
	private int total;
	
	public int getAmount() {
		return amount;
	}

	public int getTotal() {
		return total;
	}

	public void setAmount(int num) {
		this.amount += num;
	}

	public void setTotal(int price) {
		this.total += price;
	}
	
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
		System.out.println("### 바나나 ###");
		System.out.println("수량 : "+num);
	}
}
