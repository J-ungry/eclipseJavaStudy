package ch01.ex02.arrayList.case03;

import java.util.ArrayList;

public class BookTest {

	public static void main(String[] args) {
		
		//<> 안에 객체의 타입을 넣어주자 
		ArrayList<Book> library = new ArrayList<Book>(); //객체 생성을 해버리기 ~
		
		//배열 인덱스 넣지 않아도 되고 
		library.add(new Book("해리포터1","조앤"));
		library.add(new Book("해리포터2","조앤"));
		library.add(new Book("해리포터3","조앤"));
		
		
		
		//arrayList 에서는 .size
		for(int i=0; i<library.size();i++) {
			library.get(i).showBookInfo();
			//System.out.println(library[i]);
		}
	}

}
