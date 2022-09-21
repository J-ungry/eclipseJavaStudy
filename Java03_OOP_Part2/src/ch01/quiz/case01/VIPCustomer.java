package ch01.quiz.case01;

public class VIPCustomer extends Customer{

	private int agentID;
	double salesRatio; //할인률 (VIP만)
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentId() {
		return agentID;
	}
}
