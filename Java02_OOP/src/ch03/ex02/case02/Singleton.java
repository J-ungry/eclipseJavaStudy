package ch03.ex02.case02;

public class Singleton {

	private static Singleton instance = null;
	private int count = 0;
	
	private Singleton() {} //객체 생성 못하게 막아버리기
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton(); //null 일때 담아라 ~
			return instance;
			
		} return instance;
	}
	
	public void count() {
		count ++;
	}
	
	public int getCount() {
		return count;
	}
}
