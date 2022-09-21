package ch01.ex01.quiz.case06;

public class LottoAnswer {

	public static void main(String[] args) {
		SlotAnswer slot = new SlotAnswer();
		
		char isRepeat = 'y';
		
		int i=0;
		for(;i<6 && isRepeat =='y'; i++) {
			System.out.println(slot.hitSlot()); //toString 때문에 생략이 가능하다 
			isRepeat = ConsoleAnswer.inYn("공을 계속 뽑을까요 ? Y/N"); //대문자로 해서 접근 가능한거는 static 이라서 가능한거임 (위에 따로 선언 안해주고)
//			static 없으면 객체 생성해서 접근 해야해 !!!!
			
		}
		System.out.println();
		if(i==6) System.out.printf("공을 %d개 모두 뽑았습니다\n",i);
		System.out.println("End ! ");
	}
}
