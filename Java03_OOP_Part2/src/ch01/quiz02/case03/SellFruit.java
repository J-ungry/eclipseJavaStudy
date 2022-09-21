package ch01.quiz02.case03;

public class SellFruit {

	private int totalPrice;
	private int totalNum;
	
	public int getTotalPrice() {
		return totalPrice;
	}
	public int getTotalNum() {
		return totalNum;
	}
	public void setTotalPrice(int price) {
		this.totalPrice += price;
	}
	public void setTotalNum(int num) {
		this.totalNum += num;
	}
	
	
}
