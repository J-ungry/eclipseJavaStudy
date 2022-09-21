package ch03.ex03.case05.dao.score;

import ch03.ex03.case05.domain.Score;

public class ScoreDaoImpl implements ScoreDao{
	
	private Score[] scores;	//점수
	private int cursor; 	//record 의 위치를 가리킴 
	
	

	public ScoreDaoImpl(Score[] scores) { //생성
		this.scores = scores;
	}

	@Override
	public void setScore(Score score) {
		this.scores[this.cursor++] = score;
		
	}

	@Override
	public Score[] getScores() {
		return this.scores;
	} //추상메소드 구현하고 객체 생성까지 하는 친구임 

}
