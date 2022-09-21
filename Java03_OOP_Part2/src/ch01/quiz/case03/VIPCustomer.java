package ch01.quiz.case03;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio; //할인률 (VIP만)
	
	public VIPCustomer(int customerID, String customerName) {  //부모와 똑같은 형태로 만들어줘야한다 
//		super(0,null); 부모는 상속 받고 생성자 유지하면서 하는 방법 
		super(customerID,customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentID;
	}
	
	@Override //오버라이딩 됨을 알려주는 annotation 그대로덮어쓰는거임 선언부빼고 나머지 다 똑같아야한다 
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio); //형을 맞춰주자 !!할인율만큼 값을 깎아줌
}
	@Override
	public String showCustomerInfo() {
		return customerName + "님의 등급은 "+customerGrade + "이며 보너스 뽀인트는 "+bonusPoint;
	}
}
//메소드 정의부가 똑같다 ! 그리고 블록 안 내용을 재정의 