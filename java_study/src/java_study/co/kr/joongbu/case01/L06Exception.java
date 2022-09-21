package java_study.co.kr.joongbu.case01;

import java.util.Scanner;

public class L06Exception {

	public static void main(String[] args){
		//컴파일시 발견되지 않는 오류를 예외처리 하는 방법
		
		String[] arr = {"a","b","c"};
		Scanner sc = new Scanner(System.in); //모든 통신은 문자열로 이루어진
		
		while(true) {
			System.out.println("{\"a\",\"b\",\"c\"} 찾고싶은 배열의 인덱스 입력 !");
			String str = sc.nextLine();
			try {
				System.out.println("arr["+str+"] >> "  +arr[Integer.parseInt(str)]);
			} catch(NumberFormatException e) {
				System.out.println("정수만 입력하세요 !");
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("0-2 까지 숫자만 입력하세요 !!");
			} catch(Exception e) {// 모든 예오ㅣ 
				System.out.println("알수없는 오류 발생  ");
			} finally { //무조건 한번 실행 (통신을 하고 종료할 때 많이 사용한ㄷㅏ )
				System.out.println("무조건 실행되는 친구임 ");
			}


		}

	}

}
