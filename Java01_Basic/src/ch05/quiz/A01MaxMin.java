package ch05.quiz;

public class A01MaxMin {
/*
 * 나열된 수에서 최솟값과 최대값 구하기 
 * -여러개의 수가 배열에 있을 때 그 중 가장 큰 값과 작은 값을 찾는다 
 * -배열의 몇 번째에 있는지 순서를 찾는다 
 * -반복문을 한버만 사용해서 문제 해결
 * {10,52,23,2,79,101,16,82,30,45}
 */
	public static void main(String[] args) {
		int num[] = {10,52,23,2,79,101,16,82,30,45};
		
		int max = num[0];
		int min = num[0];
		
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i=0; i<num.length;i++) {
			if(max <= num[i]) {
				maxIndex = i+1;
				max = num[i];
			}
			if(min >= num[i]) {
				minIndex = i+1;
				min = num[i];
			}
		}
		System.out.printf("MAX Index > %d , MAX > %d\n",maxIndex,max);
		System.out.printf("MAX Index > %d , MAX > %d",minIndex,min);
	}

}
