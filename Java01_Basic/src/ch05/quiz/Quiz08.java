package ch05.quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//필요한 값 입력받
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호텔 방 개수 입력 > ");
		int roomCount = sc.nextInt();
		System.out.println();
		System.out.print("시작 객실 번호 입력 > ");
		int roomStart = sc.nextInt();
		
		//방과 관련된 배열 생성 
		boolean roomStatus[] = new boolean[roomCount];
		int roomNumber[] = new int[roomCount];
		
		//배열들 초기화하기 
		for(int i=0; i<roomCount; i++) {
			//roomStatus[i] = false;
			roomNumber[i] = roomStart+i;
		}
		
		//프로그램 종료시 사용할 변수 
		boolean check = false;
		//무한루프 프로그램 동작  
		while(!check) {
			
			//메뉴 출력부분 
			System.out.println("#### 선택 메뉴 ####\n");
			System.out.println("1. 입실 ");
			System.out.println("2. 퇴실 ");
			System.out.println("3. 방정보 ");
			System.out.println("0. 프로그램 종료 ");
			
			//메뉴 선택 부분 
			System.out.print("선택 > ");
			int menu = sc.nextInt();
			
			System.out.println();
			
			//선택시 실행 
			switch(menu) {
			case 1: 
				System.out.print("입실할 방 번호 > ");
				int inRoom = sc.nextInt();
				boolean checkRoomNum = false;
				
				//방이 입실 가능한지 확인
				for(int i=0;i<roomStatus.length; i++) {
					//입실 가능한 경우
					if(inRoom == roomNumber[i]) {
						if(roomStatus[i] == false) {
							System.out.println("입실 완료 !\n");
							roomStatus[i] = true;
							checkRoomNum = true;
							break;
						} else {
							System.out.println("이미 입실이 완료된 방입니다 !\n");
							checkRoomNum = true;
							break;
						}
					}
					
				}
				if (!checkRoomNum) {
					System.out.println("존재하지 않는 방 번호 입니다 !\n");
				}
				break;
				
			case 2: 
				System.out.print("퇴실 할 방 번호 > ");
				int outRoom = sc.nextInt();
				boolean checkRoomNum2 = false;
				
				//방이 퇴실 가능한지 확인
				for(int i=0;i<roomStatus.length; i++) {
					//입실 가능한 경우
					if(outRoom == roomNumber[i]) {
						if(roomStatus[i] == true) {
							System.out.println("퇴실 완료 !\n");
							roomStatus[i] = false;
							checkRoomNum2 = true;
							break;
						} else {
							System.out.println("이미 입실이 완료된 방입니다 !\n");
							checkRoomNum2 = true;
							break;
						}
					}
					
				}
				
				if (!checkRoomNum2) {
					System.out.println("존재하지 않는 방 번호 입니다 !\n");
				}
				break;
				
			case 3: 
				System.out.println("---- 방 정보 ----");
				for(int i=0; i<roomStatus.length; i++) {
					if(!roomStatus[i]) { //방이 비어있는 경
						System.out.printf("%d 번방 : 비어있음\n",roomNumber[i]);
					} else {
						System.out.printf("%d 번방 : 입실 가능\n",roomNumber[i]);
					}
				}
				
				System.out.println();
				break;
				
			case 0: 
				check = true;
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
		}
		
	}

}
