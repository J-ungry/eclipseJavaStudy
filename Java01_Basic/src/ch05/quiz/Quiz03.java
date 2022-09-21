package ch05.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		double avg;
		int total = 0;
		
		int nums[] = {100,50,100,50};
		
		for(int i : nums) {
			total += i;
		}
		
//		avg = (total / nums.length);
		avg = 1.0 * total / nums.length;
		System.out.printf("Total > %d  Ave > %.1f",total,avg);  
		
		
	}
}
