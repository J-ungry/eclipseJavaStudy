package ch03.ex01.case02;

public class Ship {

	int passengerCnt;
	static int totalCnt;
	
	public void sail(int passengerCnt) {
		this.passengerCnt = passengerCnt;
		Ship.totalCnt += passengerCnt;
	}
	
	public int getTotalCnt() {
		return Ship.totalCnt;
	}
}
