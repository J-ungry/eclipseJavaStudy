package ch03.quiz.project02Answer.presentation;

import java.util.Scanner;

public interface Console {
	
	Scanner sc = new Scanner(System.in);
	
	static void in(String msg) {
		System.out.print(msg + "\n > ");
	}
	
	static void err(String msg) {
		System.out.print("ERROR) "+msg);
	}
	
	static void info(String msg) {
		System.out.print(msg);
	}
	
	static void info(Object obj) { //toString 이 있어서 이렇게만 해줘도 바로 실행이 될 거시다 !!!!!
		System.out.print(obj);
	}
	
	static void success(String msg) {
		System.out.print("SUCCESS) "+msg+" 성공했습니다 ");
	}
	static void fail(String msg) {
		System.out.print("FAIL) "+msg+" 실패했습니다 ");
	}
	
	static String inStr(String msg) {
		boolean isVal = false;
		String line = "";
		
		do {
			in(msg);
			line = sc.nextLine();
			
			isVal = line.length() >0; //0보다 큰지 확인 
			if(!isVal) err("문자열을 입력하세요. ");
		}while(!isVal);
		
		return line;
	}
	
	static int inNum(String msg) { //인터페이스는 객체 생성이 안되기 때문에 static 으로 하면 사용 가능하다 !
		boolean isVal = false;
		String line = "";
		int num = 0;
		
		do {
			in(msg);
			line = sc.nextLine();
			
			if(line.length() > 0 && line.matches("[0-9]*")) { //모든 숫자가 0-9 사이의 값을 갖는디 
				num = Integer.parseInt(line);
				isVal = true;
			}
			
			if(!isVal) err("0 이상의 정수를 입력하세요 ");
			
		}while(!isVal);
		
		return num;
	}
	
}
