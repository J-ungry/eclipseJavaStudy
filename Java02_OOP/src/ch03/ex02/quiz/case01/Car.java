package ch03.ex02.quiz.case01;

public class Car {
	
	private static int serialNum = 10001;
	
	int carNum;
	
	Car(){
		this.carNum = serialNum;
		serialNum++;
	}

}
