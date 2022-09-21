package ch02.quiz_sub2.step01;

public class FootNanoStopWatch {

	//field
	long startTime;
	long endTime;
	
	//method
	public double getElapsedTime() {
		return (double)(endTime-startTime) / 1_000_000_000;
	}
	

}

/*
 * 요구 사항 : 나노세컨드로 경과시간을 만들어 주세요
 */ 
