package ch02.quiz_sub2.step02;

public class StopWatch {
	
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
	
	//Nano 인 경우 
	
	long startNanoTime;
	long endNanoTime;
	
	
	void startNano() {
		startNanoTime = System.nanoTime();
	}
	void stopNano() {
		endNanoTime = System.nanoTime();
	}

	
	//method
	public double getElapsedNanoTime() {
		return (double)(endNanoTime-startNanoTime) / 1_000_000_000;
	}
}
