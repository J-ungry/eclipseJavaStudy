package ch04.ex03;

public class C03For {

	public static void main(String[] args) {
		
		int i =1;
		for(;i<10;i*=2) { //생략가능하나 새미콜론 꼭 넣어야함 
			System.out.println(i+" ");
		}
		System.out.println("\n Number that came out : "+i);

	}

}
