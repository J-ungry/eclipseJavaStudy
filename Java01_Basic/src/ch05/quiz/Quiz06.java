package ch05.quiz;

public class Quiz06 {

	public static void main(String[] args) {
		
		char alpha[] = new char[26];
		
		for(int i=65; i<65+alpha.length;i++) {
			alpha[i-65] = (char)i;
		}
		
		for(int i=0;i < alpha.length;i++) {
			System.out.printf("%c , %d \n",alpha[i],(int)alpha[i]);
		}
		
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] = ch ++;
		}
		
		for (int i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + " , "+(int)alphabets[i]);
		}
	}

}
