package java_study.co.kr.joongbu.case01;

import java.io.IOException;

public class L20IntputOutputStream {

	public static void main(String[] args) {

		//입출력 장치와 스트림 
		/*
		 * 입력과 출력 : 컴퓨터 내부, 외부 장치에서 프로그램 간에 데이터를 주고 받는것 
		 * 파일을 입력받거나 출력받는 행위소리를 출력 , 키보드 or 마우스 입력 
		 * 모니터에 출력 
		 * 
		 * 에러가 날 수 있으므로 try,catch 를 해야한다 
		 */
		try {
			int i= System.in.read();
			System.out.println("입력한 값 : "+i); //아스키코드 (1byte짜리 문자표) 
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
