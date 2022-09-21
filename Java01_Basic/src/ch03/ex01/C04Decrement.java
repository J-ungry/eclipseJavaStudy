package ch03.ex01;

public class C04Decrement {

	public static void main(String[] args) {
		int i =0;
		--i;
		System.out.println(i);
		i--;
		System.out.println(i);
		
		//전위연산자(--i) 
		i =0 ;
		int j = --i;
		System.out.printf("i = %d j = %d\n",i,j);
		
		//후위연산자(i--) 증가 이전의 값을 참조한다.
		i = 0;
		j = i--;
		System.out.printf("i = %d j = %d\n",i,j);
		
	}

}
