package ch02.quiz_sub2.step04;

public class StopMilliWatch extends StopWatch{ //상속해가지고 오버라이드 해서 사용하기 


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
	@Override
	void execute() {
		start();
		
		for(long i=0; i<30_000_000_000l; i++) {}
		
		stop();
		
		double elapsedTime = getElapsedTime();
		System.out.printf("밀리 경과시간 : %3f\n",elapsedTime);
		
	}
	

}
