package ch03.ex02.case05;

public class SubCalculator extends CalculatorImpl{

	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}

	@Override
	public int div(int num1, int num2) {
		if(num2 ==0) {
			return ERROR;
		}
		return num1/num2;
	}

	public void showInfo() {
		System.out.println("모두 구현하였습니다");
	}
}
