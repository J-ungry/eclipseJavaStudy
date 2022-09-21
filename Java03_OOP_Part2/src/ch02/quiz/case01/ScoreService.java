package ch02.quiz.case01;


public class ScoreService extends Template{	
	
	public int menu() {
		System.out.println("===== MENU =====");
		System.out.println("1. INPUT");
		System.out.println("2. OUTPUT");
		System.out.println("3. MODIFY");
		System.out.println("4. DELETE");
		System.out.println("0. END THE PROGRAM");
		System.out.print(">> ");
		return sc.nextInt();
	}



	@Override
	public void input(Object[] o) { //최상위와 우리가 만든 객체이기 때문에 downCasting
		Score[] s = (Score[]) o;
		
		if(cnt == o.length) {
			System.out.println("더이상 생성 안됨요 ㅋㅋ");
			return;
		}
		s[cnt] = new Score();
		System.out.print("이름 입력 >>>");
		s[cnt].setName(sc.next());
		
		System.out.print("국어 점수 입력 >>>");
		s[cnt].setKor(sc.nextInt());
		System.out.print("영어 점수 입력 >>>");
		s[cnt].setEng(sc.nextInt());
		System.out.print("수학 점수 입력 >>>");
		s[cnt].setMa(sc.nextInt());
		
		s[cnt].setTotal(s[cnt].getKor(),s[cnt].getEng(),s[cnt].getMa());
		s[cnt].setAvg(s[cnt].getTotal());
		

		cnt ++;
	}

	@Override
	public void output(Object[] o) {
		
		if(cnt == 0) {
			System.out.println("출력할게 없쪄요");
			return;
		}
		for(int i=0; i<cnt; i++) {
			Score s = (Score) o[i]; //이런 방법 사용할 수 있음 !!!!
			System.out.println("####"+ s.getName()+"####");
			System.out.println("국어 점수 >>> "+s.getKor());
			System.out.println("영어 점수 >>> "+s.getEng());
			System.out.println("수학 점수 >>> "+s.getMa());
			
			System.out.println();
		}
		
		
	}

	@Override
	public void modify(Object[] o) {
		Score[] s = (Score[]) o;
		
		if(cnt==0) {
			System.out.println("검색할 게 없어요 ");
			return;
		}
		System.out.print("수정하고 싶은 이름 입력 >>> ");
		String name = sc.next();
		for(int i=0; i<cnt; i++) {
			if(s[i].getName().equals(name)) {
				
				System.out.print("수정 할 국어 점수 입력 >>>");
				s[i].setKor(sc.nextInt());
				System.out.print("수정 할 영어 점수 입력 >>>");
				s[i].setEng(sc.nextInt());
				System.out.print("수정 할 수학 점수 입력 >>>");
				s[i].setMa(sc.nextInt());
				
				System.out.println("수정 완료 ");
				return;
				
			}
		}
		System.out.println("일치하는 이름이 없습니다요옹");
		
	}

	@Override
	public void delete(Object[] o) {
		Score[] s = (Score[]) o;
		if(cnt == 0) {
			System.out.println("삭제할게 없어용 !");
			return;
		}
		
		System.out.print("삭제하고자 하는 아이디 입력 >>>");
		String name = sc.next();
		
		for(int i=0; i<cnt; i++) {
			if(s[i].getName().equals(name)) {
				for(int j = i; j<cnt-1; j++) {
					s[j] = s[j+1];
				}
				cnt --;
				System.out.println("삭제 완료 ");
				return;
			}
		}
		System.out.println("삭제하고자 하는 아이디가 없습니다 !!!");
		
	}
	
	




}
