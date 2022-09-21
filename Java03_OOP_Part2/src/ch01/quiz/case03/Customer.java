package ch01.quiz.case03;

public class Customer {

	private int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
}

public String showCustomerInfo() {
	return customerName + "님의 등급은 "+customerGrade + "이며 보너스 토인트는 "+bonusPoint;
}

public int getCustomerID() {
	return customerID;
}

public String getCustomerName() {
	return customerName;
}

public String getCustomerGrade() {
	return customerGrade;
}

public void setCustomerID(int customerID) {
	this.customerID = customerID;
}

public void setCustomerName(String customerName) {
	this.customerName = customerName;
}

public void setCustomerGrade(String customerGrade) {
	this.customerGrade = customerGrade;
}
}
