package ch02.ex01_print;

public class C03Print03 {

	public static void main(String[] args) {
		// % 자릿수d - 자릿수만큼 공간 가짐 (오른쪽 정렬) 
		System.out.printf("%5d\n",10);
		
		// % -자릿수d - 자릿수만큼 공간 가짐(왼쪽 정렬)
		System.out.printf("%-5d\n%d\n",10,10);
		
		// %0자릿d - 빈공간이 0으로채워짐
		System.out.printf("%05d\n",10);
		
		System.out.printf("%f\n", 1.23456789);
		
		//%전체자릿수.소수점자리수f
		System.out.printf("%10.2f\n", 1.23456789);
		
		//%.소수점자릿수f
		System.out.printf("%.2f", 1.23456789);
	}

}
