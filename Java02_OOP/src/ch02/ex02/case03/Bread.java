package ch02.ex02.case03;

public class Bread {

	
	private int price ;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("가격이 %d인 빵", price);
	}
}
