package ch02.quiz_sub2.step03;

public class StopWatchDemo {

	public static void main(String[] args) {
		
		StopNanoWatch s = new StopNanoWatch();
		
		s.start();
		
		for(long i=0; i<30_000_000_000l; i++) {}
		
		s.stop();
		
		double elapsedTime = s.getElapsedNanoTime();
		System.out.printf("경과시간 : %3f",elapsedTime);
	}

}
