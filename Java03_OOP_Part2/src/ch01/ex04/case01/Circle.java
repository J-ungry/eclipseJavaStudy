package ch01.ex04.case01;

public class Circle extends Point{
	
	private int radius;
	
	public Circle(int x,int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d",super.toString(),radius); //toString 하며는 xy 나올거시다 
	}

}

//(x,y) , radius