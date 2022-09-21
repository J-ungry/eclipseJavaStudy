package java_study.co.kr.joongbu.case01;

import java.time.LocalTime;

public class L10RunnableLambda {

	public static void main(String[] args) {
//		Thread clockThread = new Thread(new Runnable() {//run() 을 스레드로 생성한다  Thread 안에는 interface 가 들어가게 된다 
//
//			@Override
//			public void run() {
//				while(true) {
//					System.out.println(LocalTime.now());
//					try {Thread.sleep(1000);} catch(InterruptedException e) {e.printStackTrace();}
//				}
//			}}); 
		
//		Thread clockThread = new Thread(()->{
//			while(true) {
//				System.out.println("현재시간 : "+LocalTime.now());
//				try {Thread.sleep(1000);} catch(InterruptedException e) {e.printStackTrace();}
//			}
//		});
		
		Runnable clock = ()->{
			while(true) {
				System.out.println("현재시간 : "+LocalTime.now());
				try {Thread.sleep(1000);} catch(InterruptedException e) {e.printStackTrace();}
			}
		};
		
		Thread clockThread = new Thread(clock);
		clockThread.start(); //스레드가 실행되기 위해 start 하면 된다 
		System.out.println("main thread");
	}

}
