package ch01.ex05.case01;

public abstract class AbstractMethod { //추상 class :추상 method 를 포함하는 클래스 
	
	abstract int getAge(); //추상 Method : body {} 가 없는 / 뒤에 뭐 붙어있으면 안되고 그냥 띵 끝나야한다 
	//추상 클래스와 추상메소드는 한몸이다 우리는 하나 ! 그래서 추상 메소드가 하나라도 있으면클래스도 추상 클래스가 되어야한다 
	abstract void setAge(int num);

//	public abstract String makeAbstract() {
//		return "추상메소드는 블록의 내용을 구현하지 않습니다";
//	}
}

//추상메소드 