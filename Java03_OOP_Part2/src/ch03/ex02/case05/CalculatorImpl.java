package ch03.ex02.case05;

public abstract class CalculatorImpl implements Calculator{

	@Override
	public int add(int num1, int num2) {

		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1- num2;
	}

//곱하기 나누기 구현 안했으니까 abstract 로 해야한다 

}
