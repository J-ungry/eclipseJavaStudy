package ch03.ex01.case03;

public class Main {

	public static void main(String[] args) {
		
		Computer computer; // interface 타입의 참조변수 선언 가능 
//		computer = new Computer(); //interface 는객체 생성 할 수 없다 
		
		Computer desktop = new Desktop(); //upcasting
		desktop.getOnline(); //오버라이딩 된 메소드가 우선 돼 호출 
	}

}
