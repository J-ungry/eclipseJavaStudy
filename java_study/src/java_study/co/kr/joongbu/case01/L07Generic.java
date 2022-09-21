package java_study.co.kr.joongbu.case01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//특정페이지의 타입을 하는게 제네릭이다 
//제네릭 정의할땐 이렇게 해야한다 보통은 타입을 바꾼다 해서 T, 두개를 바꿈면 TP 이렇게 함 
class GenericTest<T>{
	T name;
	
	public GenericTest(T name) {
		this.name = name;
	}
}

interface Carable{
	
}

class Qm3 implements Carable{}
class Qm5 implements Carable{}

class CarInfo<T extends Carable>{ // carable 이 부모인 타입만 제네릭으로 지정 가능 
	T car;
	public void print() {
		System.out.println(car.getClass()+": "+car.toString());
	}
}
public class L07Generic {

	public static void main(String[] args) {
		
		Qm3 qm3 = new Qm3();
		Qm5 qm5 = new Qm5();
		CarInfo carInfo = new CarInfo();
		carInfo.car = qm3;
		carInfo.print();
		
		GenericTest a = new GenericTest(13);
		System.out.println(a.name);
		GenericTest<Integer> a2 = new GenericTest<Integer>(200);
		System.out.println(a2.name);
		
		
		
		List<Integer> list = new ArrayList<Integer>(); //기본형은 제네릭으로 사용할 수 없다 !!! 참조형만 된다나 뭐라나 ~
		//list.add("1");
		//Integer 는 int의랩펔 클래스
		//랩퍼클래스가 하ㅏ는 일 (Byte,Short,Integer,Long,Float.Double.Character) !!!암기하자 !!!!!
		//1. 형변환 Integer.parseInt("13");
		//2. 기본 데이터타입의 정보를 포함 Integer.MAX_VALUE
		//3. 제네릭 타입 으로 사용 된다 .
		list.add(1);
		list.add(20);
		list.add(300);
		System.out.println(list);
		
		Object[] birthArr = {1986,2000,1990.0,2002F,1900l}; //태어난 날 저장  
		int now = 2022;
		Object[] ageArr = new Object[5];
//		for(int i=0; i<birthArr.length; i++) {
//			int age = (now -(int)birthArr[i]); //형변환을 해주면된다 
//			System.out.println(age);
//			
//			ageArr[i] = age; //이렇게 하면은 에러파티남 
//		}
//		List birthList = new ArrayList();
//		birthList.add(1986);
//		birthList.add("1986");
//		birthList.add(1986.0);
//		birthList.add(1986F);
//		birthList.add(1986l);
//		for(int i=0; i<birthList.size(); i++) {
//			int age = now-(int)birthList.get(i); //컴파일시 발견되지 않는 심각한 오류 
//		}
		
		//여기서 이제 제네릭을 걸거임 
		List<Integer> birthList2 = new ArrayList<Integer>();
		birthList2.add(1986); //컴파일도 안됨  =>오류를 미연에 방지하기 위해 제네릭을 사용한다 
//		birthList2.add("1986");
//		birthList2.add(1986.0);
//		birthList2.add(1986F);
//		birthList2.add(1986l);
		//제네릭을 사용하면 정수만 필드로참조할 수 있다.  오류를 미연에 방지할 수 있
		//Map에서 Key : 중복되지 않는 어떤것이든 가능 (Set) 키와 밸류의 형태  제네릭으로 키와 밸류 둘다지정할 수 있다.
		Map<Integer,String> person = new HashMap<Integer,String>();
		person.put(1998,"서정우");
		person.put(1998,"김명섭");
		person.put(2002,"둘리");
		System.out.println(person);
		//key는 중복될 수없는 Set type 이기 때문에 명섭이가 정우를 재정의함 
		//map 은 자료구조가 순서가 없다 
		System.out.println(person.get(2002)); //키로 값을 빼올 수 있다 
		
		Set<Integer> set = new HashSet<Integer>();  //중복이 허용되지 않는 순서가 없는 자료구조  제네릭으로 키와 밸류 둘다지정할 수 있다.
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		set.add(10);
		System.out.println(set);
		
		
	}

}
