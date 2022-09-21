package ch05;

public class C07Array {

	public static void main(String[] args) {
		// length error reasons

		double[] d= new double[5];
		
		d[0] = 1.1;
		d[1] = 2.1;
		d[3] = 3.1;
		
		double mtotal = 1;
		for(int i=0; i<d.length; i++) {
			mtotal *= d[i]; //mtotal = mtotal * d[i]
		}
		
		System.out.println(mtotal);
	}

} //배열의 길이와 요소의 개수는 동일하지 않습니다. 
