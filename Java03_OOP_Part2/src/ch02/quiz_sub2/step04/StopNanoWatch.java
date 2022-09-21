package ch02.quiz_sub2.step04;

public class StopNanoWatch extends StopWatch{

	//Nano 인 경우 

	void start() {
		startTime = System.nanoTime();
	}
	void stop() {
		endTime = System.nanoTime();
	}

	
	//method
	public double getElapsedTime() {
		return (double)(endTime-startTime) / 1_000_000_000;
	}
	
	@Override
	void execute() {
		start();
		
		for(long i=0; i<30_000_000_000l; i++) {}
		
		stop();
		
		double elapsedTime = getElapsedTime();
		System.out.printf("나노 경과시간 : %3f\n",elapsedTime);
		
	}
}
