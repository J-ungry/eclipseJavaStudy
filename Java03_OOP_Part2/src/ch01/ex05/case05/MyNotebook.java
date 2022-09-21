package ch01.ex05.case05;

public class MyNotebook extends Notebook{ //notebook 에 추상메서드를 가지고 있으니까 추상이다 !! 따라서 구현을 안해줬던 getOnline 을 구현해줘야한다 

	@Override
	void getOnline() {
		// TODO Auto-generated method stub
		System.out.println("개인 노트북으로 인터넷에 접속 합니다 ");
	}  
	
	void doWebCam() {
		System.out.println("웹캠으로 회의를 합니다 ");
	}
	

	
}
