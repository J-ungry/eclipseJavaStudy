package ch05.quiz;

public class Quiz07 {

	public static void main(String[] args) {

		int num[] = new int[5];
		
		
		for(int i=0; i<5;i++) {
			num[i] = i;
			System.out.print(num[i]+" ");
		}

		System.out.println();
		
		int ran1,ran2;
		int tmp1,tmp2;
		
		for(int i =0; i<100; i++) {
			ran1 = (int)(Math.random()*4); //0-3까지 랜덤 
			ran2 = (int)(Math.random()*4);
			
			tmp1 = num[ran1];
			tmp2 = num[ran2]; //랜덤값들을 백업
			
			num[ran1] = tmp2;
			num[ran2] = tmp1;
		}
		
		for(int i=0; i<5;i++) {
			System.out.print(num[i]+" ");
		}
		
		/*
		 * for(int i=0; i<100;  i++){
		 * int n = (int)(Math.random()*5);
		 * 
		 * int tmp = num[0];
		 * num[0] = num[n];
		 * num[n] = tmp;
		 * }
		 */
		
		
		
	}

}
