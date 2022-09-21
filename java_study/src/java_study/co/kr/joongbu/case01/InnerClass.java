package java_study.co.kr.joongbu.case01;
import java.lang.*;
import java.util.Scanner; //개발자들에게 유용한 클래스를 모아놓은 클래스 
import java.util.ArrayList; //HashMap . . . 컬렉션 프레임워크 라고 부른다 (유용한 자료구조)


public class InnerClass {
	//class 생성 : java -> class로 컴파일 (Javac)
	//패키지 생성 이유 ? : 클래스의 고유 이름을 제공, 비슷한 성격의 클래스의 모음 
	//public class : 자바 문서와 동일한 이름의 클래스 (이름이 다르면 에러 나용) ,다른 패키지에서 Import 해서 사용할 수 있는 class
	//main 메소드 : jre 를 호출해서 작성한 코드를 순서대로 실행 -> 순차적언어 
	public static void main(String[] args) {
		System.out.println("안녕 ! ");
		java.lang.String s  = "dd"; //기본 ?? 참조 ?? -> 참조형 ~~
		java.lang.Integer i = 13;  //랩퍼클래스 
		
		int i2 = 44; 
		int i3 = 44;
		int i4 = 44;
		int i5 = 44;
		char[] arrC = {'a','b','c','d','e'};// 배열 => 참조형 (리터럴하게 선언되고 있다 
		char[] arrC2 = new char[5]; //0 으로 초기화 된다 
		Character[] arrC3 = new Character[5]; //null 로 초기화 된다 
		String s3 = "abcde"; //선언은 기본형처럼 되지만 문자의 배열이기 때문에 참조함 
		//기본형 데이터(원시형) 타입의 특징 ?? -> 면접 단골 질문 
		// 원시형 데이터 : int i = 4 => 메모리 4바이트 공간을 할당 
		//1. 리터럴하게 선언 ??? : 문자 그대로 : 대부분 수와 연관되어 있기 때문에 , 자주 사용하기 때문에
		//2. 스택 메모리에 생성됨 : 자주 쓰기 때문
		//3. i2~5 까지 같은 44를 참조 
		
		//참조형 데이터 타입의 특징 
		Object o = new Object(); 
		// 0="경민", 1="길동"
		//1. new 연산자로 생성자를 호출하면 참조형 데이터(객체)가 생성 (생성자 ???  class 와 동일한 이름을 갖는 존재)
		//2. 객체가 생성되는 메모리 ?? 힙 메모리에 생성됨 (가비지 컬렉션에 의해 정리 => 포인터가 필요가 없어진다 ) => 인스턴스 객체 
		//3. 
		
		정욱채 욱 = new 정욱채();
		System.out.println(욱.name);
		
	}

}

class 정욱채 {
	String name="정욱채";
	String[] hands = {};
	int bitrh = 1990;
}
