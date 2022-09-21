package ch03.ex01.case02;

public interface Interface {
	
//	void play() {} //인터페이스는 일반 메소드를 가질 수 없음 추상 메소드만 가짐 
	
	abstract int getAge(); //추상 method
	void setAge(int num); //abstract 생략 가능하다 !!하지만 컴파일러가 자동으로 붙여준다 !!
 
}
