package ch02.ex02.quiz.quiz01Answer;

public class Main {

	public static void main(String[] args) {

		Worker worker = new Worker("영수", 20_000);
		Taxi taxi = new Taxi("카카오");
		
		worker.takeTaxi(taxi);
		worker.takeTaxi(taxi);
	
		taxi.showTaxiInfo();
		worker.showWorkerInfo();
	}

}
