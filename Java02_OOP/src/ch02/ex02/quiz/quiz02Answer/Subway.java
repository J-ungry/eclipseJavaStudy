package ch02.ex02.quiz.quiz02Answer;

public class Subway {
	
	int lineNum;
	int income;
	int passengerCnt;
	
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}

	
	public void take(int money) {
		this.income += money;
		passengerCnt ++;
	}
	public void showSubwayInfo() {
		System.out.printf("%d 호선의 승객은 %d 명이고, 수입은 %d 원 입니다. \n",lineNum,passengerCnt,income);
	}

}
