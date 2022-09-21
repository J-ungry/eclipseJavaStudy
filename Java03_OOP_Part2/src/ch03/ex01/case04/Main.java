package ch03.ex01.case04;

public class Main {

	public static void main(String[] args) {

		C c = new C(); //a 와 b 와 c 모두 가능하다 c 는 a 와 b 를 구현했기 때문이다 
		B b = c; // 업 캐스팅 
		A a = c;
		
		c = (C) a; // 다운캐스팅 
		c = (C) b;
		
		b = (B) a; // 가능은 하지만 의미는 없다 왜냐면 서로 별로기 때문에 
	}

}
