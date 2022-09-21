package java_study.co.kr.joongbu.case01;

//프로그래밍 객체와 타입 재사용과 유지보수 


//객체지향 문법을 사용하지않고 자동차 구현
//계획 : 기능 구현 (앞으로 , 뒤로 ,멈춘다 , 와이퍼 .. .동작 -> 메소드 ) , 재원(타이어,핸들,와이퍼,엑셀 )
//필드 , 프로퍼티 ,속성(attribute) 
//재원이 있고 동작하는 것을 객체라 하고 이런 객체의 설계도를 타입이라고 한다 


//프로그래머는 어떤 코드던 재사용을 전재로 작업 ==> 습관을 가지면 모드느 코드가 객체지향 문법으로 설계가 된다 
class 소리 {
	String s = "부부부르르릉";
}
//엔진에 기능을 추가 
//단점 => 배우기 어렵다 (스프링) -> 기업이 돈을 많이 써야해 !! 
class 엔진 {
	int fuel;
	int bpm; 
	소리 부르릉 = new 소리();

}

class BmwS3 extends 엔진{
	public String name="bmw 3 series";
	public 엔진 en = new 엔진();
	class 바퀴{
	}
	class 브레이크패달 {
		int press = 0; //필드는 기본값이 있다. 기본형은 0, 참조형은 null 
	}
	class 핸들{
		int turn; //왼쪽 + 오른쪽 
		
	}
	class 악셀 {
		int press;
	}
	

	
	public void move() {}
	public void turn() {}
	public void stop() {}
	
}
class BmwS5{
	public String name="bmw 3 series";
	
	class 바퀴{
		int 반지름 = 30;
	}
	class 브레이크패달 {
		int press = 0; //필드는 기본값이 있다. 기본형은 0, 참조형은 null 
	}
	class 핸들{
		int turn; //왼쪽 + 오른쪽 
		
	}
	class 악셀 {
		int press;
	}
	
	class 엔진 {
		int fuel;
		int bpm; 
		소리 부르릉 = new 소리();
		class 소리 {
			String s = "부부부르르릉";
		}
	}
	
	public void move() {}
	public void turn() {}
	public void stop() {}
	
}
public class L04Extends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
