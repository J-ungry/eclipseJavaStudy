package ch02.ex02.quiz.quiz02;

public class Bus {

	String busName;
	int income;
	int total;
	
	public Bus(String busName) {
		this.busName = busName;
		income = 0;
		total = 0;
	}
	
	public void take(int money) {
		income += money;
		total ++;
	}
	public void showBusInfo() {
		System.out.println(busName + "의 수입은 : "+income+"원 입니다 .");
		System.out.println(busName + "의 승객 수 는  : "+total+"명 입니다 .");
		System.out.println();
	}
}
