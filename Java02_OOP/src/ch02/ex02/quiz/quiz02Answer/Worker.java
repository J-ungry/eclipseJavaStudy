package ch02.ex02.quiz.quiz02Answer;

public class Worker {

	String workerName;
	int money;
	
	//생성자 
	public Worker(String workerName, int money) {
		this.workerName = workerName;
		this.money = money;
	}

	
	//method
	public void takeBus(Bus bus) {
		bus.take(2000);
		this.money -= 2000;
		
	}
	
	public void takeSubway(Subway subway) {
		subway.take(3000);
		this.money -=3000;
	}
	
	public void showWorkerInfo() {
		System.out.printf("%s 님의 잔액은 %d 원 입니다. . \n",workerName,money);
	}
}
