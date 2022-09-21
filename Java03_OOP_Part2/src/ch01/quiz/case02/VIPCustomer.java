package ch01.quiz.case02;

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
}
