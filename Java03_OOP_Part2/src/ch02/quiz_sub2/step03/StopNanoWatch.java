package ch02.quiz_sub2.step03;

public class StopNanoWatch {

	//Nano 인 경우 
	
	long startTime;
	long endTime;
	
	
	void start() {
		startTime = System.nanoTime();
	}
	void stop() {
		endTime = System.nanoTime();
	}

	
	//method
	public double getElapsedNanoTime() {
		return (double)(endTime-startTime) / 1_000_000_000;
	}
}
