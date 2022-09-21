package ch02.ex02.quiz.quiz02Answer;

public class Main {

	public static void main(String[] args) {

		Worker A = new Worker("A",10000);
		Worker B = new Worker("B",10000);
		
		Bus b400 = new Bus(400);
		Bus b500 = new Bus(500);
		
		Subway s1 = new Subway(1);
		Subway s2 = new Subway(2);
		
		B.takeBus(b500);
		A.takeSubway(s1);
		
		A.showWorkerInfo();
		B.showWorkerInfo();
		
		b400.showBusInfo();
		b500.showBusInfo();
		
		s1.showSubwayInfo();
		s2.showSubwayInfo();
 		
	}

}
