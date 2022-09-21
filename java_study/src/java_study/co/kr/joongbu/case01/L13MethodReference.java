package java_study.co.kr.joongbu.case01;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class L13MethodReference {

	public static void main(String[] args) {
		
		//메소드 참조 (람다식을 한번 더 줄여서 작성)
		
		Function<String,Integer> ParseInt=(s) -> {return Integer.parseInt(s);};
		Function<String,Integer> ParseInt2=s -> Integer.parseInt(s);
		Function<String,Integer> ParseInt3=Integer::parseInt; //컴파일러가 해석할 수 있을 정도만 생략이 가능하다 
		//매개변수가 무조건 존재하고 반환할 때 실행되는 함수가 매개변수를 꼭 1개 사용하기 때문에 
		System.out.println(ParseInt.apply("99")*3);
		
		//뭄ㄴ자열 두 객체를 equals로 같은 지 검사하는 함수 작성 
		BiPredicate<String,String> strEquals = (s1,s2)-> s1.equals(s2);
		BiPredicate<String,String> strEquals2 = String::equals; //메소드 참조는 매개변수를 생략하는게 기본이다 
		String str = "안녕하세요!";
		String str2 = new String("안녕하세요!"); //리터럴하게 선언하지 않았으므로 동등비교가 불가능하다 
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(strEquals.test(str, str2));
		System.out.println(strEquals2.test(str, str2));
		
		char[] charArr = {'안','녕','히','가','세','요','!'};
		
		String msg = new String(charArr);
		System.out.println(msg);
		
		Function<char[],String> parseStr = (cArr) ->new String(cArr);
		Function<char[],String> parseStr2 = String::new;
		System.out.println(parseStr.apply(new char[]{'H','e','l','l','o','1'}));
		System.out.println(new char[] {'h','a','p','p','y'});
	}

}
