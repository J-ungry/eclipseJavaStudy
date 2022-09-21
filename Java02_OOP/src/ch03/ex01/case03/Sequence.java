package ch03.ex01.case03;

public class Sequence {
	
	private static int basisNum;
	private int currentNum;
	
	public static void setBasisNum(int basisNum) {
		Sequence.basisNum = basisNum;
		
	}
	
	public int nextNum() {
		currentNum = basisNum ++;
		return currentNum;
	}
	

}
