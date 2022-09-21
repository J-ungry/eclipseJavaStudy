package ch02.quiz_sub2.step01;

public class FootMilliStopWatch {

	//field
	long startTime;
	long endTime;
	
	//method
	public double getElapsedTime() {
		return (double)(endTime-startTime) / 1_000_000_000;
	}
}
