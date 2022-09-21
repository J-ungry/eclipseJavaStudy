package ch01.ex05.case05;

public class Main {

	public static void main(String[] args) {

//		Computer computer = new Computer(); //추상이라 객체 생성 안됨 
		Computer desktop = new Desktop(); //이게되네 
		desktop.show();
		desktop.getOnline();
		
		System.out.println();
		
		Computer myNB = new MyNotebook(); // 상속 두번 된 관계라서 객체 생성 가능 
		myNB.show(); //오버라이딩 
		myNB.getOnline(); //상속 ( Notebook)
		
		System.out.println();
		
		MyNotebook myNote = (MyNotebook) myNB;
		myNote.doWebCam(); //마이노트북 타입만 검색이 된다 
		myNote.show();
		myNote.getOnline();
		
	}

}
