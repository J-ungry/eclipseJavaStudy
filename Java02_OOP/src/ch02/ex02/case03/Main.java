package ch02.ex02.case03;

public class Main {

	public static void main(String[] args) {

		
		Baker b1 = new Baker();
		Baker b2 = new Baker();
		
		Bread bread = null ; //어차피 bake 실행하면 new 로 생성되기 때문에 null 넣어주면됨 
		bread = b1.bake(); // 빵 만들어버리기 ~~~~  bread 에 new bread 가 담기게 된다 제빵사 1이빵을 만드 ㅁ
		
		b2.putPrice(bread, 2000);
		
		System.out.println(bread);// toString 실행됨 !!!!
		
	}

}
