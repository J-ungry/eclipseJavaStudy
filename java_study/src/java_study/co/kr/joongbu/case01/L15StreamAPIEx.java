package java_study.co.kr.joongbu.case01;

import java.util.ArrayList;
import java.util.List;

public class L15StreamAPIEx {
	static int sum2;
	public static void main(String[] args) {
		
		Integer n = new Integer(500);
		System.out.println(10+n);
		System.out.println(10+n.intValue());

		List<Integer> numList = new ArrayList<Integer>();
		numList.add(500);
		numList.add(55);
		numList.add(5);
		numList.add(null);
		numList.add(555);
		numList.add(1);
		numList.add(3);
		numList.add(-300);
		
		int sum =0 ;
		for(Integer num : numList) {
			if(num!=null) {
				sum+= num;
			}

			
		}
		
		System.out.println(sum);
		
		numList.stream()  //filter 에는 검사식이 들어가야한다 -> true 면 stream 으로 다시 반환하고 false 면 반환하지 않는 그런 방식  
		.filter(i->i!=null) //filter : 중간연산자  (stream) 을 반환한다 
		.forEach((i)->{sum2 += i;}); //forEach : 최종연산 
		System.out.println(sum2);
	}

}
