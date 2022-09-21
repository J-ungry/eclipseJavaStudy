package ch05.quiz;

import java.util.Scanner;

public class Quiz08Answer {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("방 개수 입력 > ");
		int roomSize = sc.nextInt();
		sc.nextLine(); //enter 처리 
		System.out.print("객실 시작 번호 입력 > ");
		int startRoomNum = sc.nextInt(); //변수는 의미가 있는 애들만 만들어주자 !!!
		sc.nextLine();
		System.out.println();
		
		boolean[] room = new boolean[roomSize];
		boolean running = true;
		
		
		while(running) {
			
			//메뉴 출력부분 
			System.out.println("#### 선택 메뉴 ####\n");
			System.out.println("1. 입실 ");
			System.out.println("2. 퇴실 ");
			System.out.println("3. 방정보 ");
			System.out.println("0. 프로그램 종료 ");
			System.out.print(" > ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			int roomNum;
			switch(menu) {
			case 0:
				running = false;
				break;
			
			case 1:
				System.out.println("입실 할 방 번호 입력 ");
				roomNum = sc.nextInt() - startRoomNum; //이렇게 하면 roomNum 을 index 처럼 사용할 수 있다.
				if(roomNum < 0 || roomNum >= room.length) {
					System.out.println("존재하지 않는 방 번호 입니다.");
					System.out.println();
					continue;
				}
				if(room[roomNum]) {
					System.out.println("이미 배정된 방입니디");
				}else {
					room[roomNum] = true;
					System.out.println("입실 처리 되었습니다");
				}
				System.out.println();
				break;
				
			case 2:
				System.out.println("퇴실 할 방 번호 입력 ");
				roomNum = sc.nextInt() - startRoomNum; //이렇게 하면 roomNum 을 index 처럼 사용할 수 있다.
				if(roomNum < 0 || roomNum >= room.length) {
					System.out.println("존재하지 않는 방 번호 입니다.");
					System.out.println();
					continue;
				}
				if(room[roomNum]) {
					System.out.println("퇴실 처리 되었습니다.");
					room[roomNum] = false;
					
				}else {
					System.out.println("이미 비어있는 방입니다.");
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("---- 방 정보 ----");
				for(int i = 0; i < room.length; i++) {
					if(room[i]) {
			
						System.out.printf("%d 번방 > " ,startRoomNum+i);
						System.out.println("입실");
					} else {
						System.out.printf("%d 번방 > " ,startRoomNum+i ,"비어있음 ");
					}
				}
				
				System.out.println();
				break;
				
			default:
				System.out.println("잘못된 메뉴 선택입니다. ");
				System.out.println();
			}
		}
	}

}
