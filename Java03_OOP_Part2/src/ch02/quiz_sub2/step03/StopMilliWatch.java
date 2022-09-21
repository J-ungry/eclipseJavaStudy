package ch02.quiz_sub2.step03;

public class StopMilliWatch {

	long startTime;
	long endTime;
	
	//Milli 인 경우

	void start() {
		startTime = System.currentTimeMillis();
	}
	void stop() {
		endTime = System.currentTimeMillis();
	}
	public double getElapsedTime() {
		return (double)(endTime-startTime) / 1_000;
	}
	

}
