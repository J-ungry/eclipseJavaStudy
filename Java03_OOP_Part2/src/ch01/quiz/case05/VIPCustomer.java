package ch01.quiz.case05;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio; //할인률 (VIP만)
	
	public VIPCustomer(int customerID, String customerName, int agentID) {  //부모와 똑같은 형태로 만들어줘야한다 
//		super(0,null); 부모는 상속 받고 생성자 유지하면서 하는 방법 
		super(customerID,customerName); //여기서 초기화 삭 해준다 
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		this.agentID = agentID; //얘도 초기화해 
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
		return super.showCustomerInfo()+"담당 상담원 번호는 "+agentID + "입니다";
	}
}
//메소드 정의부가 똑같다 ! 그리고 블록 안 내용을 재정의 