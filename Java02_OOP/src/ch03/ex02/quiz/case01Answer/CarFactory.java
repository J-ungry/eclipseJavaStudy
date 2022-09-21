package ch03.ex02.quiz.case01Answer;

public class CarFactory {

	private static CarFactory instance = new CarFactory(); //자동차 공장은 유일한 객체이다 
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
			return instance;
		}
		return instance;
	}
	
	public Car createCar() {
		Car c = new Car();
		return c;
	}
}
