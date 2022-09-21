package ch01.ex01.quiz.case06;

public class BallAnswer {

	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return this.num + "";//String 으로 바꿔주기 위해 
	}
	

}
