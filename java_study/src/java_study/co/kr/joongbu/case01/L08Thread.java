package java_study.co.kr.joongbu.case01;

import java.time.LocalTime;
import java.util.Scanner;

public class L08Thread {

	public static void main(String[] args) {
		//스레드(Thread) : 실행단위(일꾼) ,main 메소드가 1개 가지고 있다(순차적 언어 main 에 작성한 코드가 순서대로 1개씩 실행되는 것)
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		boolean start = true;
		while(start) {
			System.out.println(LocalTime.now()); //스레드를 독점해서 다음 코드가 절대 실행되지 않을거임 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Scanner scanner = new Scanner(System.in); 
		String line = scanner.nextLine();
		//콘솔창에 엔터를 입력하는 것을 대기 => 스레드를 독점 
		
		System.out.println("4");
		//동시에 여러가지 일을 하려면 thread 가 여러개 존재해야한다
	}

}