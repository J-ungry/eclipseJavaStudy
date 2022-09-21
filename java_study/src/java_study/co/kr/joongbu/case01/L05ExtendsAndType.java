package java_study.co.kr.joongbu.case01;

class ObjectA{
	String a = "ObjectA.a 입니동 ";
}

class ObjectB extends ObjectA{
	String b = "ObjectB.b 입니동 ";
}

class ObjectC extends ObjectB{
	String c = "ObjectC.c 입니동 ";
}


//상속을 한 타입을 자식이라고 하고 상속을 한 타입을 부모라고 한다 
public class L05ExtendsAndType {

	public static void main(String[] args) {

		//상속은 타입의 다형성을 만든다.
		ObjectC c = new ObjectC();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		
		ObjectB b = c; //b 는 b 만큼만 참조를 한다 
		System.out.println(b.a);
		System.out.println(b.b);
//		System.out.println(b.c);  에러가 난다 !!
	
		ObjectA a = c;
		System.out.println(a.a);
//		System.out.println(a.b);  
//		System.out.println(a.c);
		
		//c 가 참조하는 객체가줄어드는 걸까용 ? => 객체는그대로지만 해당하는 타입만큼만 참조하는것이다 
		Object o=c;
		
//		if(o instanceof String) {
//			String s_o = (String)o;
//		}
		try {
			String s_o = (String)o;
		}catch (ClassCastException e) {
			e.printStackTrace();
		}
		ObjectC oc = (ObjectC)o;
//		String s_o = (String)o; //객에촤 상관없는 타입으로 캐스팅 변환 하면 컴파일시 발견되지 않는 심각한 오류 발생 !!! => 실행도중에 오류가 발생하면 어플이 멈춘다 
//		int i  = (int)"문자";// 오류가 있엉서 컴파일 할 수 없다 !! 따라서 앱을 배포할수 없음 고맙다 컴파일러야 !!!
		//컴파일 되는 언어의 장점 : 오류가 있는 코드를 배포하지 않는다 
	}

}
