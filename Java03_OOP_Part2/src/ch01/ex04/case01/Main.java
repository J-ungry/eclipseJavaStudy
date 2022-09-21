package ch01.ex04.case01;

//is-a 관계 
//상속은 클래스간의 결합도가 높은관계 
//상위에어 수정이 많으면 하위에 영향을 미칠 수 있음 
public class Main {

	public static void main(String[] args) {

		Circle circle=  new Circle(1,2,5);
		System.out.println(circle.toString());
	}

}

