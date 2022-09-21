package ch01.ex01.quiz.sub;

import java.time.LocalDate;

public class C03DateTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		date = date.plusDays(1);
		System.out.println(date);
	}

}
