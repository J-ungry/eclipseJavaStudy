package project01;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {

	private ArrayList<Member> list = new ArrayList<Member>();
	
	Scanner sc = new Scanner(System.in);
	
	public void print() {
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");

		for(Member m : list) {
			System.out.println("ID >> "+m.getId());
			System.out.println("Name >> "+m.getName());
			System.out.println();
		}
	}

	public String input(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();  
	}

	public boolean run(String inputData) {
		if (inputData.equals("1")) {
			insert();
			return true;
		} else if (inputData.equals("2")) {
			update();
			return true;
		} else if (inputData.equals("3")) {
			delete();
			return true;
		} else if (inputData.equals("4")) {
			search();
			return true;
		} else if (inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
			return false;
		} else {
			System.out.println("똑바로해!");
			print();
			String inputD = input("번호를 선택하세요 >>");
			run(inputD);
			return true;
		}
		
	}

	// 1. 아이디, 이름을 입력받는다.
	// 2. 아이디가 존재하면  "이디가 존재하여 회원을 추가할 수 없습니다." 메세지를 출력한다.
	// 3. 아이디가 존재하지 않으면 ArrayList에 회원을 추가하고 "회원을 추가했습니다." 메세지를 출력한다.
	// 4. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	// 5. ArrayList에 있는 모든 회원을 출력한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	public void insert() {		
		System.out.print("Insert ID >>");
		String id = sc.next();
		
		System.out.print("Insert Name >>");
		String name = sc.next();
		
		for(Member m : list) {
			if(m.getId().equals(id)) { //만약 동일한 아이디가 있다면 
				System.out.println("동일한 아이디가 있습니다.");
				return;
			}
		}
		Member member = new Member(id,name); // 새로운 객체 생성 
		list.add(member);
		System.out.println("회원을 추가했습니다.");
		
	}

	// 1. 수정할 아이디를 입력받는다.
	// 2. 수정할 아이디가 없으면 "수정할 아이디가 없습니다." 메세지를 출력한다.
	// 3. 수정할 아이디가 있으면 수정할 이름을 입력받고, ArrayList에 회원 정보를 수정하고 "회원을 수정했습니다."라는 메세지를 출력한다.
	// 4. print() 메서드 호출
	// 5. ArrayList에 있는 모든 회원을 출력한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void update() {
		System.out.print("Insert Update ID >>");
		String id = sc.next();
		
		for(Member m : list) {
			if(m.getId().equals(id)) { //만약 동일한 아이디가 있다면 
				System.out.println("Insert Update Name >>");
				String name = sc.next();
				m.setName(name);
				System.out.println("회원을 수정했습니다");
				return;
			}
		}
		System.out.println("수정할 아이디가 없습니다 ");
		
	}

	// 1. 삭제할 아이디를 입력받는다.
	// 2. ArrayList에서 아이디를 찾아 있으면 삭제하고 "성공적으로 삭제하였습니다" 메세지 출력하고
	//    없으면 "삭제할 아이디가 없습니다." 메세지를 출력한다.
	// 3. print() 메서드 호출
	// 4. ArrayList에 있는 모든 회원을 출력한다.
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void delete() {
		System.out.println("Insert DELETE ID >> ");
		String id = sc.next();
		int i=0;

		for(Member m : list) {
			if(m.getId().equals(id)) { //만약 동일한 아이디가 있다면 
				list.remove(i);
				System.out.println("삭제가 완료되었습니다");
				return;
			}
			i++;
		}
		System.out.println("검색결과가 없습니다 ");
	}

	// 1. 검색할 아이디를 입력 받는다.
	// 2. ArrayList에서 아이디를 찾아서 있으면 검색된 회원을 출력하고 없으면 "검색된 결과가 없습니다." 메세지 출력
	// 3. print() 메서드 호출
	// 4. ArrayList에 있는 모든 회원을 출력한다.
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void search() {
		System.out.println("Insert search ID >> ");
		String id = sc.next();
		
		for(Member m : list) {
			if(m.getId().equals(id)) { //만약 동일한 아이디가 있다면 
				System.out.println("ID >> "+m.getId());
				System.out.println("NAME >> "+m.getName());
				return;
			}
		}
		System.out.println("검색결과가 없습니다 ");
		
	}
}

