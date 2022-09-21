package ch05;

public class C07Array2 {

	public static void main(String[] args) {
		
		double[] d = new double[5];
		int count =0;
		
		d[0]= 1.1; count++;
		d[1] = 2.1; count++;
		d[2] = 3.1; count++;
		
		double mtotal = 1;
		for(int i=0; i<count; i++) {
			mtotal *= d[i];
		}
		
		System.out.println(mtotal);
	}

}
