package ch03.ex01;

public class C02Assignment {

	public static void main(String[] args) {

		int a =1 , b = 2;
		System.out.printf("a : %d, b : %d \n",a,b);
		
		a = b;
		System.out.printf("a : %d, b : %d \n",a,b);
		
		a = a + 1;
		System.out.println(a);
		
		
		//복합 대입 연산자
		int i = 3;
		i = i + 2;
		
		i += 2;
		i -= 2;
		i *= 2;
		i /= 2;
		i %= 2;
		
		System.out.println(i);
	}

}
