package ch03.ex02.case04;

public interface ConstantField { //인터페이스에는 추상메소드만 쓰는게 아니라 상수도 올 수 있다 (final 쓴 애) 
	
	public static final String NATION = "korea";
	int MAX_NUM = 100; //public static final 컴파일러가 자동으로 붙여준다 
	int MIN_NUM = 0;

}
