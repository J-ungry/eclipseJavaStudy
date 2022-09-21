package java_study.co.kr.joongbu.case01;

import java.io.IOException;
import java.nio.CharBuffer;
import java.time.LocalTime;
import java.util.Scanner;

class Clock implements Runnable{

	@Override
	public void run() {
		while(true) {
			System.out.println(LocalTime.now());
			try {Thread.sleep(1000);
			}
			
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}
}

public class L09MultiThread {

	public static void main(String[] args) {
		
		System.out.println("첫번쨰 ");
		System.out.println("두번쨰 ");
		System.out.println("세번쨰 ");

		Clock clock = new Clock();
		//Thread 의 타입을 runnable 로 제한한다 
		//타입이 명확한 객체지향 언어의 장점과 단점
		//장점 : 매개변수의 타입이 명확해서 오류가 발생하지 않는다 
		//단점 : 번거롭다. 
		//단점 극복 1: 인터페이스를 익명클래스로 구현
		//단점 극복 2: 람다식 사용 (추상메서드가 1개만 있는 인터페이스) 
		Thread clockThread = new Thread(clock); //스레드를 run()에 작성된 코드로 생성 
		clockThread.start(); //start() : 스레드를 생성하는 함수 
		System.out.println("네번쨰 ");
		Scanner sc = new Scanner(System.in);
		while(true) {		
			String line = sc.nextLine();
			System.out.println(line);
			}

	}

}
