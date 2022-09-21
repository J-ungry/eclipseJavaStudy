package sub_quiz.quiz01Answer;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		/ArrayList -추가 , 수정 , 삭제 , 조회
//		ArrayList<String>
		
		ArrayList<String> s = new ArrayList<String>();
		
		//add()
		s.add("정구링 ");
		s.add("정구링 2");
		
		//조회  - get(index)
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		
		for(int i=0; i<s.size(); i++) 
		{
			System.out.printf(s.get(i),"\t");
		}
		
		for(String p :s) {
			System.out.printf(p,"\t");
		}

	}

}
