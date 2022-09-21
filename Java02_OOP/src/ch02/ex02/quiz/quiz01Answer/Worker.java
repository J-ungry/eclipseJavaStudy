package ch02.ex02.quiz.quiz01Answer;

public class Worker {

	String workerName;
	int money;
	
	public Worker(String workerName, int money) {
		this.workerName = workerName;
		this.money = money;
		
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(5000); //이제 taxi 랑 연결 해줄거임 
		this.money -= 5000;
		
	}
	
	public void showWorkerInfo() {
		System.out.printf("%s 님의 잔액은 %d 원 입니다. ",workerName,money);
	}
}
