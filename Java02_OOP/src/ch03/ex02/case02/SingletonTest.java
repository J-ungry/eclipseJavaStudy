package ch03.ex02.case02;

public class SingletonTest {

	public static void main(String[] args) {

		Singleton s1 = Singleton.getInstance();//static 이라 접근 가능하다
		s1.count();
		
		Singleton s2 = Singleton.getInstance();//static 이라 접근 가능하다
		s2.count();
		
		Singleton s3 = Singleton.getInstance();//static 이라 접근 가능하다
		s3.count();
		
		System.out.println(s3.getCount());
		System.out.println(s1.getCount());// 얘도 3 나온다 !!!! 이거시 singleton
	}

}
