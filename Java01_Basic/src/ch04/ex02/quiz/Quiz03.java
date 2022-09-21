package ch04.ex02.quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		String season = "";
		
		if(month==3 || month==4 || month==5) {
			season = "Spring";
		} else if(month==6 ||month==7 ||month==8) {
			season = "Summer";
		} else if(month==9 ||month==10 ||month==11) {
			season = "Fall";
		} else if(month==12 ||month==1 ||month==2) {
			season = "Winter";
		} else {
			season ="NONE";
		}
		
		System.out.println(season);
	}

}
