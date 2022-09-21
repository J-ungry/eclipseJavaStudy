package ch04.ex04;

import java.util.Scanner;

public class C03While {

	public static void main(String[] args) {
		int cnt = 0;
		int random = 1;
		while(!(random % 3 == 0)) {
			cnt ++;
			random = (int)( Math.random()*100)+1;
			System.out.println(random);
		}
		System.out.printf("%d 번만에 %d 를 뽑았습니다 ",cnt,random);
		
	}

}


//(출력) 5번에 24를 뽑았습니\
