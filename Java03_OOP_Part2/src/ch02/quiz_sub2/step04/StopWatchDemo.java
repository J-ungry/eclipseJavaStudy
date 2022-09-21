package ch02.quiz_sub2.step04;

public class StopWatchDemo {
	
	public static void run(StopWatch s) {
		s.execute();
	}
//	
//	public static void run(StopNanoWatch s) {
//		s.start();
//		
//		for(long i=0; i<30_000_000_000l; i++) {}
//		
//		s.stop();
//		
//		double elapsedTime = s.getElapsedTime();
//		System.out.printf("경과시간 : %3f\n",elapsedTime);
//	}
//	
//	public static void run(StopMilliWatch s) { //서로 타입이 달라서 
//		s.start();
//		
//		for(long i=0; i<30_000_000_000l; i++) {}
//		
//		s.stop();
//		
//		double elapsedTime = s.getElapsedTime();
//		System.out.printf("경과시간 : %3f\n",elapsedTime);
//	}

	public static void main(String[] args) {
		
		StopNanoWatch s = new StopNanoWatch();
		run(s);
		
		StopMilliWatch m = new StopMilliWatch();
		run(m);
	
	}

}

/*
 * 1) StopWatch 추상 클래스 생성 
 * field : startTime , endTime 
 * execute() 추상 메소드
 */
