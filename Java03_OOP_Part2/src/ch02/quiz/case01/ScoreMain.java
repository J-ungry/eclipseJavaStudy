package ch02.quiz.case01;



public class ScoreMain {
	public static void main(String[] args) {
		
		Object[] o = new Score[5]; //이거 그냥 Score 로 넣어줘도 상관없음 Object 가 큰거기 때문에 작은 Score 가 들어올 수있다 !!!(upcasting) 
		
		ScoreService ss = new ScoreService();
		
		while(true) {
			int menu = ss.menu();
			
			switch(menu) {
			case 0:
				System.out.println("END THE PROGRAM");
				return;
				
			case 1:
				ss.input(o); //object type은 다 받을 수 있어서 그냥 넣어줘도상관 없음 (여기서 자동으로 upcasting) !!! 그냥 service 에서 다운 캐스팅 해주면 된다 
				break;
			case 2:
				ss.output(o);
				break;
			case 3:
				ss.modify(o);
				break;
			case 4:
				ss.delete(o);
				break;
			}
			
		}
	}

}


