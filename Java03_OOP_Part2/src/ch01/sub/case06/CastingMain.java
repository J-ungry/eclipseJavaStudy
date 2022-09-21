package ch01.sub.case06;

class Parent{
	int a = 10;
	int b = 20;
}

class Child extends Parent{
	int c = 30;
	
	public void output() {
		System.out.println("a : "+ a);
		System.out.println("b : "+ b);
		System.out.println("c : "+ c);
	}
}

public class CastingMain {

	public static void main(String[] args) {

		
		Parent c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
//		System.out.println(c.c); //type 이 parent 라서 c에만 정의된 애를 사용할 수 없다 
		
//		Child p =(Child) new Parent(); //큰거에서 작은거로 가는거는 그냥으 ㄴ안되고 강제로 해야한다  down_casting
		
		Child p = (Child) c; //위와 동일하게 갈 수 없다 (line 28)
		System.out.println(p.c);//접근이 가능하다 ! 
		System.out.println(p.a);
		System.out.println(p.b);
		
		Object o = new String("홍길똥전"); //오브젝트와 스트링은 up_casting 관계이다
		System.out.println(o);
		
		String s = (String) o; //down_casting
		System.out.println(s);
	}

}
