package ch02.ex02_input;

import java.io.IOException;

public class C01Input01 {

	public static void main(String[] args) throws IOException{
		
		System.out.print("입력 : ");
		
		//System.in.read()
		int x = System.in.read(); //한글자, 한 바이트씩 입력 된 값을 읽어들이는 메소드
		
		System.out.println("ASCII : " + x);
		System.out.println("변환 시킨 값 : "+ (char)x);
	}

}
