package ch03.ex02.case01;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {

//		Company c = new Company() ; private 로 해놨기 때문에 안된다 !!!!!!!
//		Company.inst . . .이것도 안
		
		Company c1 = Company.getInstance(); //객체 생성이 안되지만 원래 접근이안되는거지만 static 으로했기 때문에 class 명으로 접근 가능하다 
		Company c2 = Company.getInstance();
		//instance 는 static 이기 때문에 c1 과 c2 는 동일한 객체로 생성하게 된다 
		//생성자를 private 로 만들어 객체 생성을 막고 static 으로 데이터 영역을 공유해 객체를 하나만 만들게 된다 
		//이게 바로 싱글톤 패턴 ~~~
		
		Calendar calendar = Calendar.getInstance(); //잘 쓰이는 디자인 패턴 중 하나이다 !!
	}

}
