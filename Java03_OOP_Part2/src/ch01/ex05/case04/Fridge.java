package ch01.ex05.case04;

public class Fridge extends Appliance{

	@Override
	public void PowerOn() {
		// TODO Auto-generated method stub
		System.out.println("냉장고의 전원을 켜버리기");
	}

	@Override
	public void PowerOff() {
		// TODO Auto-generated method stub
		System.out.println("냉장고의 전원을 끄다");
	}

	
}
//추상클래스의 추상메소드는 상속받은 자식클래스에서 구현해야한다. => Add unimplemented methods 상속을 받으면무조건 구현을 해줘야함 !!!