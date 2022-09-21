package ch02.ex01_print;

public class C02Print02 {
	public static void main(String[] args) {
		
		int num  = 100;
		System.out.println(num);
		System.out.println("num : " + num + " !! ");
		
		//printf()
		//저장된 값이 출력되는 위치에 해당 타입의 형식을 넣음
		//형식 : %d(정수) %f(실수), %s(문자열), %c(단일문자)
		
		System.out.printf("num :  %d !!\n",num);
	
		int num1 = 10;
		int num2 = 10;
		int num3 = 10;
		System.out.printf("%d  %d,     %d",num1,num2,num3);
		
	}

}
