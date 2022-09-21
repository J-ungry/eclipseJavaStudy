package ch01.sub.case05;

public class Starcraft {

	public static void main(String[] args) {

		Protoss p = new Protoss();
		Protoss dragoon = new Dragoon(); //부모타입을 하고 객체 생성은 자식으로 한다  작은데 -> 큰데 로 저장
		Protoss zealot = new Zealot();
		
		dragoon.attack(); //프로토스타입 이지만 자동으로 오버라이딩 되어 각자 애들의 모습으로 출력이 된다 (오버라이딩 된게 최우선이다)
		dragoon.depense();
		
		zealot.attack();
		zealot.depense();
	}

}
