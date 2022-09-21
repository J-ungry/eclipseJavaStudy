package ch03.ex01.case06;

public class CalculatorImpl implements Calculator{

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {  //calculator implements 를 구현하겠다는 
		if(num2 == 0) {
			return -999999;
		}
		return num1/ num2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현했습니다 ");
	}

	
}
