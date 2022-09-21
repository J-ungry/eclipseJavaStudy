package ch01.sub.case02;

public class Child extends Parent{

	int a = 10;
	
	
	//오버라이딩 -> 부모로부터 받은 메소드를 똑같이 구현해 기능부분만 재정의 
	@Override
	void output() {
		super.a = 20;
		System.out.println("a >>>>" +a ); //super가 아니라 child 의 a 가 나옴 
		
		System.out.println("Parent a >>> "+super.a);
		System.out.println("Child a >>> "+this.a);

	}
	
	//오버로딩 ->같은 메소드 이름이지만 매개변수를 다르게 해 사용하는 기술 
	void output(int a) {  //이름은 똑같지만 에러가 나지 않음 
		System.out.println("a : "+a);
	}
	
	void output(int a, int b) { //매개변수개수를 다르게 하거
		
	}
	void output(String b) { //타입을 다르게 하거
		
	}
}
