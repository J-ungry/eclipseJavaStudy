package ch01.ex02.arrayList.case04;

import java.util.ArrayList;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList; //필드 생성
	
	//생성자 
	public MemberArrayList() {
		arrayList = new ArrayList<Member>(); //객체 생성 
		
	}
	//method
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId) { //아이디 같은지 확은해서 같으면 삭제하고 아니면 안삭제 하는거 
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				arrayList.remove(i); //해당 인덱스 삭제 
				return true;
			}
		}
		System.out.println(memberId+" 가 존재하지 않습니다. ");
		return false;
	}

	public void showAllMember() {
		for(Member member : arrayList) { //arrayList 엔느 Member type 이 저장되어잉씅
			System.out.println(member);
		}
		System.out.println();
	}
}
