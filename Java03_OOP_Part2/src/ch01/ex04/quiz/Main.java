package ch01.ex04.quiz;


//Has a 관계 (composition) 
//클래스가 다른 클래스를 포함하는 관계 
//student 가 subject 를 포함 
//상속하지 않음 

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle(new Point(5,5),5);
		
		System.out.println(c);

	}

}
