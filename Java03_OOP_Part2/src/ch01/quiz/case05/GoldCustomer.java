package ch01.quiz.case05;

public class GoldCustomer extends Customer{

	double salesRatio; //할인율 
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}
	
	@Override //오버라이딩 됨을 알려주는 annotation 그대로덮어쓰는거임 선언부빼고 나머지 다 똑같아야한다 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio); //형을 맞춰주자 !!할인율만큼 값을 깎아줌
}
}
