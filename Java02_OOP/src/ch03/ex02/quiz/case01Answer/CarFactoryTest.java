package ch03.ex02.quiz.case01Answer;

public class CarFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFactory factory = CarFactory.getInstance(); // 스태틱으로 접근해서 객체 생성;
		
		Car c1 = factory.createCar();
		Car c2 = factory.createCar();

		System.out.println(c1.getCarNum());
		System.out.println(c2.getCarNum());
	}

}
