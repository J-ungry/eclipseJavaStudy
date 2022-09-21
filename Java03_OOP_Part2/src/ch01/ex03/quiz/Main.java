package ch01.ex03.quiz;

import java.util.ArrayList;

/*
 * 아래 내용을 코드로 구현하세요 .
 * -물건을 담을 수 잇는 가방을 만든다 (ArrayList)
 * 가방에 지우개 하나와 연필 한 자루를 담는다 
 * 가방에 손을 넣어서 물건을 꺼내는데 , 
 * 꺼낸 물건이 지우개면 지우고 , ("지운다")
 * 꺼낸 물건이 연필이면 쓴다 . ("쓴다") 
 * 
 * 1) 상속  2) 타입변환  3)instanceof 4)ArrayList
 */

public class Main {

	public static void main(String[] args) {
		
		//호주머니 만들어쩌 
		ArrayList<Stationery> bag = new ArrayList<Stationery>();
		
		//주머니에 담았쩌
		bag.add(new Eraser());
		bag.add(new Pencil());
		
		for(Stationery x : bag) {
			if(x instanceof Eraser) {
				((Eraser)x).erase();
			}else if(x instanceof Pencil) {
				((Pencil)x).write();
			}
		}
	}

}
