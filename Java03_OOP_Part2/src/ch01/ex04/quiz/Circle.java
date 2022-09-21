package ch01.ex04.quiz;

public class Circle {

	//Has a 관계
	private Point point;  //Circle has a point 
	private int radius;
	
	public Circle(Point point, int radius) { //객체를 집어넣은것임 !!!
		this.point = point;
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d", point.toString(),radius);
	}
}
