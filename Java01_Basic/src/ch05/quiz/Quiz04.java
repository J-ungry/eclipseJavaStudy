package ch05.quiz;

public class Quiz04 {

	public static void main(String[] args) {
		
		int nums[] = {79,88,91,33,100,55,95};
		
		int min = nums[0];
		int max = nums[0];
		
		for(int i : nums) {
			System.out.println(i);
			if(i >= max) {
				max = i;
			}
			if(i<=min) {
				min = i;
			}
		}
		
		System.out.printf("max > %d  min > %d\n",max,min);
		
		int arr[] = {1,2,3,4,5};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum += arr[i];
		}
		sum = 0;
		
		System.out.println();
		
		for(int i : arr) {
			System.out.print(i+" ");
			sum += i;
		}
	}

}
