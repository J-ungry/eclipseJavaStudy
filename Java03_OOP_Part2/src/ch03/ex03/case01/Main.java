package ch03.ex03.case01;

public class Main {

	public static void main(String[] args) {

		AppleCar ac = new AppleCar();
		GoogleCar gc = new GoogleCar();
		
		MyCar car = new MyCar(ac);
		
		car.start();
		car.stop();
		car.klaxon();
		
		MyCar car2 = new MyCar(gc);
		
		car2.start();
		car2.stop();
		car2.klaxon();
	}

}
