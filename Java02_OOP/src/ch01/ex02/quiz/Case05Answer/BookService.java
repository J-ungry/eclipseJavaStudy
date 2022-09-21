package ch01.ex02.quiz.Case05Answer;

import java.util.Scanner;


public class BookService {

	
	Scanner sc = new Scanner(System.in);
	
	public int size() {
		System.out.print("등록할 책 수 입력 : ");
		return sc.nextInt();
	}
	
	public int menu() {
		System.out.println("1. 등록 ");
		System.out.println("2. 출력 ");
		System.out.println("0. 프로그램 종료 ");
		
		System.out.print("선택 >>");
		return sc.nextInt();
	}

	public void input(Book[] b) {
		for(int i=0; i<b.length; i++) {
			b[i] = new Book();
			System.out.print("Insert Book name >>");
			b[i].name = sc.next();
			System.out.print("Insert Author name >>");
			b[i].author = sc.next();
			System.out.print("Insert Price >>");
			b[i].price = sc.nextInt();
		}
	}
	
	public void output(Book[] b) {
		for(int i=0; i<b.length; i++) {
			System.out.println("###" + b[i].name + "###");
			System.out.println("Author >> "+b[i].author);
			System.out.println("Price >> "+b[i].price);
		}
	}
}
