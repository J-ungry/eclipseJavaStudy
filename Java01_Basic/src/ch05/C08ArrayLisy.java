package ch05;

import java.util.ArrayList;

public class C08ArrayLisy {

	public static void main(String[] args) {

		//ArrayList 사용 - 데이터 추가,수정,삭제,조회 
		//ArrayList 객체 생성<제네릭>
		
		ArrayList<String> s = new ArrayList<String>();
		
		//추가 - add
		s.add("김석영"); //[0]
		s.add("서정우"); //[1]
		s.add("박재희"); //[2]
		System.out.println(s.get(0));
		
		//수정 - set (index, value)
		s.set(0, "김명섭");
		System.out.println(s.get(0));
		System.out.println("-----------------");
		
		//조회 
		for(int i=0; i<s.size(); i++) {
			System.out.println(s.get(i)+"\t");
		}
		
		System.out.println("-----------------");
		
		//remove
		s.remove(1); 
		
		for(String p : s) {
			System.out.println(p+"\t");
		}
		
		//removeAll
		s.removeAll(s);
		System.out.println(s.size());
		System.out.println("-----------------");
		
		for(String p : s) {
			System.out.println(p);
		}
		System.out.println("-----------------");
	}

}
