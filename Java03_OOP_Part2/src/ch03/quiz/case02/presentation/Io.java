package ch03.quiz.case02.presentation;

import ch03.quiz.case02.service.Service;

public class Io {

	private Service service; //service 인터페이스 타입으로 필드 만들어주기 > 패키지가 다르니까 따라서 임포트 ! Has-a 관계임 
	
	public Io(Service service) { //DI
		this.service = service;
	}

	public void setService(Service service) { //입력장치가 2개가 있다고 생각하면 된다 
		this.service = service;
	}
	
	public void greet() { //얘는 그냥 io 에서 만든 메소드인 (오버라이딩 아니다) 
		System.out.println(service.greet()); //서비스 인터페이스로부터받은 리턴 값을 io가 화면에 출력하는데 이용한다  !!이제부터 연결 하는게 참 중요하다 !!
		
	}
	
	
}
