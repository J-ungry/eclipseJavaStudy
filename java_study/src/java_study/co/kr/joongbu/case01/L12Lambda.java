package java_study.co.kr.joongbu.case01;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface
interface Func<T,P>{ //앞에꺼는 매개변수 뒤에꺼는 리턴
	P apply(T t);
}

public class L12Lambda {

	public static void main(String[] args) {
		//Javascript(함수형언어, 프로토타입 언어)  람다식 : function(){} 프로토타입(타입) class(문법적 설탕==function), () =>{} 람다식 함수 (타입이 존재하지 않는)
		//function Sum(a,b) {this.a=a; this.b=b; this.sum = function(){}} let calc = new Calc();
		
		Function<Integer,Long> square=(i)->{return (long)i*i;}; //매개변수가 인티저고 리턴이 롱인 애를 받아야함 
		Function<Integer,Long> square2 = new Function<Integer,Long>() {

			@Override
			public Long apply(Integer t) {
				long result = t*t;
				return result;
			}
		};
		
		BiFunction<Integer,Integer,Long> sum=(i,i2)->{return (long)(i+i2);}; //매개변수가 두개있고 리턴이 존재하는 애  얘도 apply를 재정의 하는거임 람다식으로 
		System.out.println(sum.apply(40, 200));
		
		Consumer<Integer> squarPrint = (i) -> {System.out.println(i*i);}; //매개변수 1개만 존재하는 함수 
		squarPrint.accept(133);
		
		//Predicate(검사식) : 매개변수와 반환하는 값이 있는데 반환하는 값의 타입은 무조건 boolean
		Predicate<String> nullCheck = (s) ->s != null; //리턴 타입을 boolean 으로 지정해준다 
		//Supplier : 반환하는 것 만 있는 함수 정의 
		Supplier<Integer> randomNum = ()->{return(int)(Math.random()*10)+1;}; //1-10 까지 랜덤한 수를 반환하는 함수 
		System.out.println(randomNum.get());
		
		BinaryOperator<Integer> sum2 = (i,i2) ->{return i+i2;};
		System.out.println(sum2.apply(45, 99));
	}

}
