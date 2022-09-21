package ch02.ex02_input.quiz;


import java.io.IOException;

public class Quiz01 {
	public static void main(String[] args) throws IOException {
		
		System.out.print("입력 : ");
		
		//System.in.read()
		int x = System.in.read(); //한글자, 한 바이트씩 입력 된 값을 읽어들이는 메소드
//		char x = (char) System.in.read();
		
		System.out.println("변환 시킨 값 : "+ (char)x);
	}
}
