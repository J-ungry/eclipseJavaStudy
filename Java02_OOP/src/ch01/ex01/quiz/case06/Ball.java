package ch01.ex01.quiz.case06;

public class Ball {

	int balls[] = new int[6]; //공 저장할 배열 
	int cnt = 0; //몇번째 공인지 확인하기 
	
	void saveBall(int nowNum,int nowBall) {
		System.out.printf("%d 째 : %d \n",nowNum+1,nowBall);
		balls[nowNum] = nowBall;
	}
	
	void output() {
		for(int i=0; i<balls.length;i++) {
			System.out.printf("%d\t",balls[i]);
		}
		System.out.println();
	}
}
