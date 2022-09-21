package ch04.ex03;

public class C02For {

	public static void main(String[] args) {
		
		int i =0;
		for(;i<10;i++) { //생략가능하나 새미콜론 꼭 넣어야함 
			System.out.println(i+" ");
		}
		System.out.println("\n Number that came out : "+i);
		
		//무한 반복 
		//for(int j=0; ;) {
		//	System.out.println(j);
		//}
		
//		int k = 0;
//		for(;k<10;) {
//			System.out.println(k);
//		}
		
//		int d = 0;
//		for(;;d++) {
//			System.out.println(d);
//		}
		
//		for(;;) { //무한 루프 
//			System.out.println(1);
//		}
		
		int e = 0;
		for(;;) {
			e ++;
			System.out.println(e);
			if (e==10) break;
		}	
	}
}
