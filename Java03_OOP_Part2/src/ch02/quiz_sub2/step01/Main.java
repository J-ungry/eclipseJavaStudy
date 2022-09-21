package ch02.quiz_sub2.step01;

public class Main {

	public static void main(String[] args) {
		

//		FootNanoStopWatch f = new FootNanoStopWatch();
//		
//		f.startTime = System.nanoTime();
//		
//		for(long i=0; i<3_000_000_000_000L; i++) {
//		
//		}
//		f.endTime = System.nanoTime();
//		
//		double elapsedTime = f.getElapsedTime();
//		System.out.printf("경과시간 : %9f",elapsedTime);
		
		FootMilliStopWatch m = new FootMilliStopWatch();
		
		m.startTime =System.currentTimeMillis();
		
		for(long i=0; i<300_000_000_000_000L; i++) {
			
			}

		m.endTime = System.currentTimeMillis();
		double elapsedTime = m.getElapsedTime();
		System.out.printf("경과시간 : %,.3f",elapsedTime);
	}

}
