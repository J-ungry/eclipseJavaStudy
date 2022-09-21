package ch03.ex03.case01;

public class MyCar implements SmartCar{

	
	private SmartCar software; //has-a 관계 MyCar has a SmartCar 
	
	public MyCar(SmartCar software) {  //DI 방식 (Dependenct Injection) : 생성자에서 의존객체를 매개변수로 넣는 작업 
		this.software = software;
	}
	@Override
	public void start() {
		software.start();
	}

	@Override
	public void stop() {
		software.stop();
	}

	@Override
	public void klaxon() {
		software.klaxon();
	}
}
