package ch01.ex02.case01.sub;

import ch01.ex02.case01.A;

public class B {
	
	public void test() {
		A obj2 = new A(); //import 해주자 
		int x = 0;
		
//		x = obj2.a;
//		x = obj2.b;
//		x = obj2.c;
		x = obj2.d; //d 만 나온다 
		
//		obj2.m1();
//		obj2.m2();
//		obj2.m3()
		obj2.m4(); //public 인 애들만 나온다 
	}
	
}
