package ch02.quiz.case02;

import java.util.Scanner;

public abstract class Template {

	public abstract void input(Object[] o);
	public abstract void output(Object[] o);
	public abstract void modify(Object[] o);
	public abstract void delete(Object[] o);
	
	Scanner sc = new Scanner(System.in);
	
	int cnt = 0;
	
}
