package ch01.ex05.case06;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다. ");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다. ");
	}
	
	final public void run() { //final 이라고 해놓으면 재정의가 안되고 아무도 못건들여 !!! 템플릿 메소드고 시나리오다 !
		startCar();
		drive();
		stop();
		turnOff();
	}
}
