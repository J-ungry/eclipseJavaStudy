package ch05.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		//Create name,score array
		String name[] = new String[len];
		int score[] = new int[len];
		
		for(int i = 0; i<score.length; i++) {
			System.out.print("Insert Name >");
			name[i] = sc.next();
			System.out.print("Insert Score >");
			score[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<len;i++) {
			for(int j=0;j<name.length-i-1;j++) {
				//int now = score[i];
				if (score[j]>score[j+1]) { //새로 오는게 더 크다
					int now = score[j];
					score[j] = score[j+1];
					score[j+1] = now;
					
					String nowName = name[j];
					name[j] = name[j+1];
					name[j+1] = nowName;
				}
				
				
			}
		}
		System.out.println("Name   Score    Rank");
		for(int i = 0; i<score.length; i++) {
			System.out.printf("%s    %d    %d\n",name[i],score[i],(i+1));
		}
		
//		
//		
		
		System.out.println("Insert NUM > ");
		int num = sc.nextInt();
		
		String names[] = new String[num];
		int scores[] = new int[num];
		int rank[] = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.println("이름 입력 > ");
			names[i] = sc.next();
			System.out.println("성적 입력 > ");
			score[i]= sc.nextInt();
			
			rank[i] = 1;
			for(int j=0; j<i; j++) {
				if(score[j] > score[i]) rank[i]++;
				if(score[j] < score[i]) rank[j]++;
			}
		}
		
		System.out.println("Name\tScore\tRank");
		for(int i=0; i<num;i++) {
			System.out.println(names[i]+"\t"+scores[i]+"\t"+rank[i]);
		}
	}

}
