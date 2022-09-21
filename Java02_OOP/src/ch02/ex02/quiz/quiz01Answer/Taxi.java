package ch02.ex02.quiz.quiz01Answer;

public class Taxi {

	String companyName;
	int income;
	
	public Taxi(String companyName) {
		this.companyName = companyName;
		
	}
	
	public void take(int money) {
		this.income += money;
		
	}
	public void showTaxiInfo() {
		System.out.println(companyName + "사의 수입은 : "+income+"원 입니다 .\n");
	}
	
}
