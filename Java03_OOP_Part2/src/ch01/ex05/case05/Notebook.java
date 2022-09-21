package ch01.ex05.case05;

public abstract class Notebook extends Computer{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("노트북 화면에서 이미지가 보여집니다 ");
	}

//나는 하나만 구현하고 싶은데 어떡하지 ?!?! => abstract 붙여준다 
	//추상 method 를 포함하기 때문이다 !!! getOnline 은 여전히 추상 메서드 

}
