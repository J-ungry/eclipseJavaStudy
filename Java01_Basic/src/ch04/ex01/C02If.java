package ch04.ex01;

public class C02If {

	public static void main(String[] args) {
		
		int visitCnt = 0;
		if(visitCnt < 1) {
			System.out.println("첫 방문");
			visitCnt++;
			return; // return 이 없으면 아래것도 실행된다 .
		}
		if(visitCnt >= 1) {
			System.out.println("재 방문");
			
		}
	}

}
