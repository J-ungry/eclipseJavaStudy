package ch03.ex02.case03;

public class Main {

	public static void main(String[] args) {

		System.out.println(ConstantField.MOON_RADIUS); //static 으로 공유가 되기 때문에 객체 생성을 하지 않고 사용했다 
		System.out.println(ConstantField.MOON_AREA);
	}

}
