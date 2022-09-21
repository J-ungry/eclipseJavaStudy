package ch03.ex03.case01;

public class AppleCar implements SmartCar{

	@Override
	public void start() {
		System.out.println("Apple Car Start");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Apple Car Stop");
	}

	@Override
	public void klaxon() {
		// TODO Auto-generated method stub
		System.out.println("Apple Car klaxon");
	}

}
