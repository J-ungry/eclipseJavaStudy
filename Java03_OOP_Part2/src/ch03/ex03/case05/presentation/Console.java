package ch03.ex03.case05.presentation;

import java.util.Scanner;

public interface Console {

	Scanner sc = new Scanner(System.in);
	
	static int inNumber(String message) { //인터페이스는 객체 생성이 안되기 때문에 static 으로 하면 사용 가능하다 !
		boolean isGoodValue = false;
		String line = "";
		int number = 0;
		
		do {
			System.out.print(message + ": ");
			line = sc.nextLine();
			
			if(line.length() > 0 && line.matches("[0-9]*")) { //모든 숫자가 0-9 사이의 값을 갖는디 
				number = Integer.parseInt(line);
				if(0<= number && number <= 100) isGoodValue = true;
			}
			
			if(!isGoodValue) {
				System.out.println("ERROR 0 이상 100 이하의 숫자를 입력하세요 ");
			}
			
		}while(!isGoodValue);
		
		return number;
	}
	 
	static void outNumber(int number) { //숫자값 출력 
		System.out.println(number + ": ");
	}
	
	static void showInfo(String message) { //문구 출력 
		System.out.println("\n" + message);
	}
	
	static void showInfo(Object object) { //문구출력 
		System.out.println(object.toString());
	}
	
}
