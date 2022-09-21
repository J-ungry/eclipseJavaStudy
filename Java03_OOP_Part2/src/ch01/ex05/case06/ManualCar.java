package ch01.ex05.case06;

public class ManualCar extends Car{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("사람이 운전합니다");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("사람이 브레이크를 밟아서 멈춥니다");
	}

}
