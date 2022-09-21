package ch03.ex02.quiz.case01;

public class CarFactoryTest {

	public static void main(String[] args) {
		
		CarFactory cf = new CarFactory();
		
		Car c1 = cf.createCar();
		Car c2 = cf.createCar();
		Car c3 = cf.createCar();
		
		System.out.println(c1.carNum);
		System.out.println(c2.carNum);
		System.out.println(c3.carNum);

	}

}
