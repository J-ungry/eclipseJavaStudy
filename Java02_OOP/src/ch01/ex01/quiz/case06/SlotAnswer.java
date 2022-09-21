package ch01.ex01.quiz.case06;

public class SlotAnswer {

	public BallAnswer hitSlot() {
		BallAnswer ball = new BallAnswer();
		ball.setNum((int)(Math.random()*45)+1);
		
		return ball;
	}
}
