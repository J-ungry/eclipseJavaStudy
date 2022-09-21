package java_study.co.kr.joongbu.case01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class L22FileWriter {

	public static void main(String[] args) {

		FileWriter fw = null; //문자열을파일로 출력하는 객체 
		BufferedWriter bw = null; //보조 스트림 
		
		try {
			fw = new FileWriter("newFile.txt");
			bw = new BufferedWriter(fw);
			bw.write("안녕하세요");
			System.out.println("work");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bw!=null)
				try {
					if(bw!=null) bw.close();
					if(fw!=null) fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
	}

}
