package ch02.quiz.case03;

import java.util.Scanner;

public abstract class AbstractExam {

	public abstract int menu();
	public abstract void input(Object[] o);
	public abstract void output(Object[] o);
	
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	
}
