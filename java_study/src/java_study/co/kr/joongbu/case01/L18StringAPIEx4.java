package java_study.co.kr.joongbu.case01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L18StringAPIEx4 {

	public static void main(String[] args) {
		

		//성적 관리 프로그램 
		//장학금 대상자 2명 모든 과목의 성적이 80 이상이여야 장학금이 나온다. (검사식을 구현하세요) 
		//80보다 큰 값이 몇개가 있는지 확인하면 된다 
		
		//forEach(Consumer)  : 출력 
		//reduce(BinaryOperator)	: 소모 (요소들을 1개의 결과로 줄인다.)
		//sum(),average() : 연산 소모 (기본형)
		//count(), max, min(기본형), max, min(참조형 sort) : 집계, 통계 연산
		
		//anyMatch(),allMatch(),noneMatch() : 검사 (중간 연산 filter 유사함)
		//collect() : 수집 ( 주간연산 map 과 유사 )
		
		int [] scoreArrCKM= {88,50,70,100,30,90}; //최경민 성적 
		int [] scoreArrHKD= {90,100,99,100,85,92}; //정구리 성적 
		
		long c = Arrays.stream(scoreArrCKM)
		.filter((s)->s<80)
		.count();
		
		System.out.println("경민 성적 >> "+c);
		
		
		//allMatch
		boolean test = Arrays.stream(scoreArrCKM)
		.allMatch(x -> x >=80);
		
		System.out.println("경민 모두 80점 이상인가 ?? >> "+test); // false
		
		boolean test2 = Arrays.stream(scoreArrHKD)
		.allMatch(x -> x >=80);
		
		System.out.println("정구리 모두 80점 이상인가 ?? >> "+test2); // 
		
		//anyMatch
		//1개라도 60점 미만의 점수가 있으면 장학금 대상에서 탈락 
		
		test = Arrays.stream(scoreArrCKM)
				.anyMatch(x-> x <60);
		
		System.out.println("경민 60점 미만인게 있나 ? >> "+test);
		
		test2 = Arrays.stream(scoreArrHKD)
				.anyMatch(x->x<60);
		System.out.println("정구리 60점 미만인게 잇나 ? >> "+test2);
		
		Stream stream = Stream.of("a",1,"v",29,"c","D"); 
		Stream<String> stream2 = Stream.of("123","1","13","29","53","20"); // 제네릭을 통해 타입을 제한할 수 있다 !!!
//		ArrayList<String> strList = stream2.collect(Collectors.toCollection(()->new ArrayList<String>())); //stream 자료형에서 ArrayList 자료형으로 바꿔줬다 !!!
		ArrayList<Integer> strList = stream2
				.map(Integer::parseInt)
				.collect(Collectors.toCollection(ArrayList<Integer>::new)); //내가 쓰고싶은타입으로 반환하기 
		System.out.println(strList);
		
//		stream2.forEach(null); //stream 은 방향성이 있는 자료구조로 한번 사용하면 다시 사용 불가능하다 
		Stream<String> stream3 = Stream.of("11","1","55","33","100","-50");
//		int sum = stream3.collect(Collectors.summingInt((str)->Integer.parseInt(str)));
		int sum = stream3.mapToInt(Integer::parseInt).sum();
		System.out.println(sum);
		
		

	}

}
