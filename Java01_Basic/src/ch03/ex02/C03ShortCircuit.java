package ch03.ex02;

public class C03ShortCircuit {

	public static void main(String[] args) {
		
		//빠른 And와 빠른 OR Short  circuit evaluation
		
		boolean b = false;
		int x = 0, y = 0;
		
		b = ++x < 0 && ++y < 0; //앞만 계산했을떄 이미 false 니까 뒤에를 계산 안함 !!!
		System.out.printf("x : %d , y : %d , b : %b\n",x,y,b);
		
		x = y = 0 ;
		b = ++x > 0 || ++y < 0; //얘도 이미 앞에만 계산했을때 갑이 나오므로 뒤에 계산 안함
		System.out.printf("x : %d , y : %d , b : %b",x,y,b);
	}

}
