package ch03.ex02.case05;

public interface Calculator {

	double PI= 3.14; //public static final 이 생략되어있
	int ERROR = -9999999;
	
	int add(int num1 , int num2);
	int sub(int num1 , int num2);
	int mul(int num1 , int num2);
	int div(int num1 , int num2);
}
