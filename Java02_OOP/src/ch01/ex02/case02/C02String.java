package ch01.ex02.case02;

public class C02String {

	public static void main(String[] args) {

		boolean b = false;
		
		String s1 = "a";
		b= (s1 == "a");
		System.out.println(b); //true
		
		String s2 = new String("a");
		b = (s2=="a");
		System.out.println(b);
		
		b= s2.equals("a");
		System.out.println(b);
		
	}

}
