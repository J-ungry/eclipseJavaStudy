package ch04.ex01.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력 : ");
		String name = sc.next();
		String location;
		System.out.println("### 출생지역 선택 ###");
		System.out.println("1. 서울");
		System.out.println("2. 경기도권");
		System.out.println("3. 강원도권");
		System.out.println("4. 충청도권");
		System.out.println("5. 경상도권");
		System.out.println("6. 전라도권");
		System.out.println("7. 제주도권");
		
		System.out.print("출생 지역 선택 : ");
		int num = sc.nextInt();
		
		String local ="";
		if(num==1) {
			local = "서울";
		}
		else if(num==2) {
			local = "경기도";
		}
		else if(num==3) {
			local = "강원도";
		}
		else if(num==4) {
			local = "충청도";
		}
		else if(num==5) {
			local = "경상도";
		}
		else if(num==6) {
			local = "전라도";

		}
		else if(num==7) {
			local = "제주도";
		}
		else {
			System.out.printf("%S님은 그 외의 출생지에서 태어나셨습니다",name);
			return;
		}
		System.out.printf("%s님은 %s에서 태어나셨습니다",name,local);
	}

}
