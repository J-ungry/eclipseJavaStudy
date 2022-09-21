package ch02.ex02_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C02Input02 {

	public static void main(String[] args) throws IOException {
		
		//문자열 입력 : BufferedReader, Scanner
		//자바에서 주로 입력 받을 때 쓰는건 Scanner 
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("문자열 입력 : ");
		String str = in.readLine();
		
		System.out.println("문자열 : " + str);
	}

}
