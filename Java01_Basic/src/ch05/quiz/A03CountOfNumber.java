package ch05.quiz;

//20세부터 100세 이하의 사람들이 어느 한 장소에 머물고 있다고 할 때 
//각 연령대 별 인원이 몇명씩인지 체크해 보세요
//{55,40,27,99,76,81,29,31,33,62}
//10 명중 20 ㄷ는 몇명입니다 . .
//. . 
//. . .

public class A03CountOfNumber {

	public static void main(String[] args) {

		int arr[] = {55,40,27,99,76,81,29,31,33,62};
		int cnt[] = new int[8];
		
		for(int i: arr) {
			int index= i/10;
			cnt[index-2] += 1;
		}
		
		for (int i=0; i<cnt.length; i++) {
			System.out.printf("%d 명중 %d0대는 %d명 입니다. \n",arr.length,(i+2),cnt[i]);
		}
		
		int ages[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int age = arr[i];
			if(age<30) ages[0]++;
			else if (age < 40 ) ages[1]++;
			else if (age < 50 ) ages[2]++;
			else if (age < 60 ) ages[3]++;
			else if (age < 70 ) ages[4]++;
			else if (age < 80 ) ages[5]++;
			else if (age < 90 ) ages[6]++;
			else if (age < 100 ) ages[7]++;
		}
	}

}
