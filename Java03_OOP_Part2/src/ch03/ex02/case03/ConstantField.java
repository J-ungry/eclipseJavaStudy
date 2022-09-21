package ch03.ex02.case03;

public class ConstantField {

	static final double MOON_RADIUS = 1700;
	static final double MOON_AREA = MOON_RADIUS * MOON_RADIUS * Math.PI; //static 을 붙이면 공유가 됨으로 객체 생성을 하지 않아도 된다 
}
