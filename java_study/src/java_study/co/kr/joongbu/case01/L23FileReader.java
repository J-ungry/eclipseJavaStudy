package java_study.co.kr.joongbu.case01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L23FileReader {

	public static void main(String[] args) {


//		FileReader fr = null; // 문자열로 된 파일을 불러오는 객체 
//		BufferedReader br = null;
//		
//		try {
//			fr = new FileReader("newFile.txt");
//			br = new BufferedReader(fr);
//			String line = null;
//			while((line= br.readLine())!=null) {
//				System.out.println(line);
//			}
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//	}
		
		//AutoCloseable:tyr() 에서 생성한 객체를 자동으로 close 해주는 문법 
		try(
				FileReader fr = new FileReader("./src/java_study/co/kr/joongbu/case01/L20InputOutputStream.java");
				BufferedReader br = new BufferedReader(fr);
				){
			String line = null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
