package java_study.co.kr.joongbu.case01;

enum E{ //열거형 보통 얘를 제외하고 말한다 ,인터페이스 추상클래스 클래스 
	
}

@FunctionalInterface //추상메소드 꼭 1개 정의해야한다 !!!!
interface C{ //type C 추상메소드만 정의할 수 있다 
	void print(); // public 을 생략해도 자동으로 된다 
}

abstract class B{
	public abstract void print(); //추상메서드를 정의할 수 있다 
}  //typeB


class A{ //A type 
	
}

public class L03Type {
	//자바는 아래처럼 저렇게 만드는걸 인정하지 않기 때문에 ,, 
	//static field : jvm 이 코드를 실행할 때 static 으로 정의된 변수를 메소드 영역에서 생성 (보통 상수를 선언) 
	public static int I = 13;// 상수 메소드 영역에 저장되는 static field(변하지 않는 정보) 
	
	static class InClass extends B{
		@Override
		public void print() {}
	}

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE); //static 필드로 정의된 상수 
		
		A a = new A();
//		B b = new B();
//		C c = new C();
//		인터페이스와 추상클래스는 추상메소드가 있기 때문에 객체로 생성할 수 없다.
		B b = new B() { 
			//생성과 동시에 구현하면 객체로 생성할 수 있다 , 인터페이스도 마찬가지 
			//이때 이너 클래스가 생성되는데 숫자로 붙은 익명 클래스로 만들어진다 -> 폴더에서 bin 안에 만들어지는 그것들 
			@Override
			public void print() {
				
			}
		};
		
		B b2 = new InClass();
		
		//static 안쓰면 B b3 = new L03Type().new InClass(); 이렇게 써줘야 한다 
		
		C c = new C() { 
			@Override
			public void print(){}
		};
		
		//람다식 : 함수형 언어를 표방한 화살표 함수로 작성된 객체 (자바에서는 함수가 객체가 될 수 없다) 
		//자바에서 람다식을 작성하기 위해서는 인터페이스에 추상메서드가 1개만 만들어져 있어야한다.
		//자바에서 함수를 매개변수로 사용할 수 없기 때문에 함수를 매개변수로 사용하려면 꼭 타입을 정의해야한다. 이것을 간편하게 하기 위해서 람다식을 사
		
		//자바에서는 함수를 객체로 사용 (X) 함수형 언어인척 오~지게 한다 진짜 ~~~
		C c2 = () -> {}; //interface 에 추상 메서드가 하나 이쓰면 줄여서 쓸 수 있다 !(람다식) 함수형 언어 방식이라고 부른다 
		

	}

}
