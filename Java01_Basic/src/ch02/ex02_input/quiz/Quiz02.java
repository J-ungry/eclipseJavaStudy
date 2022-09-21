package ch02.ex02_input.quiz;

import java.io.IOException;

public class Quiz02 {
	public static void main(String[] args) throws IOException {
		System.out.print("1 이니셜 입력");
		char a = (char) System.in.read();
		System.out.print("2 이니셜 입력");
		char b = (char) System.in.read();
		System.out.print("3 이니셜 입력");
		char c = (char) System.in.read();

		
		System.out.println("이니셜 출력 : "+a+b+c);
	}

}
//엔터는 입력을 종료하는 키, 엔터는 \r\n 입니다. 따라서 두칸이 내려가게 됩니다. 
