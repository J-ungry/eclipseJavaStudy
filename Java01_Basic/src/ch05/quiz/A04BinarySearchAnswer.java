package ch05.quiz;

public class A04BinarySearchAnswer {

	public static void main(String[] args) {

		
		int numbers[] = {12,25,31,48,54,66,70,83,95,108};
		
		int target = 12;
		
		int left = 0; //시작 값 
		int right = numbers.length-1; //끝 값 
//		int mid = (left+right)/2; //중간 값 
//		
//		int tmp = numbers[mid];
		int mid =0;
		int tmp = 0;
		boolean find = false;
		
		while(left <= right) {
			mid = (left+right)/2; //중간 값 
			tmp = numbers[mid];
			if(target==tmp) {
				find = true;
				break;
			} else if (target < tmp) { //찾으려는 수가 더 작은경우 
				right = mid - 1;
			} else { //찾으려는 수가 더 큰 경우 
				left = mid + 1;
			}
			
			
		}
		if(find == true) {
			
			mid ++ ;
			System.out.println(mid);
		}else {
			System.out.println("수 업져");
		}
	}

}
