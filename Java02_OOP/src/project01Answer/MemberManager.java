package project01Answer;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {

	private ArrayList<Member> list = new ArrayList<Member>();
		
	public void print() {
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");

	}

	public String input(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();  
	}

	public void run(String inputData) {
		if (inputData.equals("1")) {
			insert();

		} else if (inputData.equals("2")) {
			update();
		} else if (inputData.equals("3")) {
			delete();
		} else if (inputData.equals("4")) {
			search();
		} else if (inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
		} else {
			System.out.println("똑바로해!");
			print();
			String inputD = input("번호를 선택하세요 >>");
			run(inputD);
		}
		
	}

	// 1. 아이디, 이름을 입력받는다.
	// 2. 아이디가 존재하면  "이디가 존재하여 회원을 추가할 수 없습니다." 메세지를 출력한다.
	// 3. 아이디가 존재하지 않으면 ArrayList에 회원을 추가하고 "회원을 추가했습니다." 메세지를 출력한다.
	// 4. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	// 5. ArrayList에 있는 모든 회원을 출력한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	public void insert() {		
		String id = input("아이디 >> ");
		String name = input("이름 >>");
		
		Member m = new Member(id,name);
		
		Member mem = select(id); // 일치하게 있으면 받는 애임 
		if(mem != null) {
			System.out.println("아이디가 존재하여 회원을 추가할 수 없습니다. ");
		} //만약 받아온게 있으면 !! 
		else {
			list.add(m);
			System.out.println("회원을 추가했습니다");
		}
		print();
		for(Member member : list) {
			System.out.printf("Id >> %s\t Name >> %s \n",member.getId(),member.getName());
		}
		String inputData = input("번호를 선택하세요 >> ");
		run(inputData);
		
		
	}
	// 1. 수정할 아이디를 입력받는다.
	// 2. 수정할 아이디가 없으면 "수정할 아이디가 없습니다." 메세지를 출력한다.
	// 3. 수정할 아이디가 있으면 수정할 이름을 입력받고, ArrayList에 회원 정보를 수정하고 "회원을 수정했습니다."라는 메세지를 출력한다.
	// 4. print() 메서드 호출
	// 5. ArrayList에 있는 모든 회원을 출력한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void update() {
		
	}

	// 1. 삭제할 아이디를 입력받는다.
	// 2. ArrayList에서 아이디를 찾아 있으면 삭제하고 "성공적으로 삭제하였습니다" 메세지 출력하고
	//    없으면 "삭제할 아이디가 없습니다." 메세지를 출력한다.
	// 3. print() 메서드 호출
	// 4. ArrayList에 있는 모든 회원을 출력한다.
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void delete() {
		
	}

	// 1. 검색할 아이디를 입력 받는다.
	// 2. ArrayList에서 아이디를 찾아서 있으면 검색된 회원을 출력하고 없으면 "검색된 결과가 없습니다." 메세지 출력
	// 3. print() 메서드 호출
	// 4. ArrayList에 있는 모든 회원을 출력한다.
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void search() {
	}
	
	public Member select(String id) {
		Member member = null;
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i);
			if(id.equals(m.getId())) {
				member = m; // 객체를 담아준다.
				break;
			}
		}
		return member;
		
	}
}

