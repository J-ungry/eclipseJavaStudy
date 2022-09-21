package ch02.ex01_print.quiz;

public class Quiz03 {

	public static void main(String[] args) {
		int korea = 100;
		int eng = 80;
		int math = 70;
		
		int total = korea + eng + math;
		double avg = (double)total / 3;
		
		System.out.println("total : "+ total +"\n 평균 : " +avg);
		System.out.printf("total : %d  \navg : %f",total,avg);
	}
}
