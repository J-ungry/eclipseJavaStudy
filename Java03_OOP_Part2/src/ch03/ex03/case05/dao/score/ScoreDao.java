package ch03.ex03.case05.dao.score;

import ch03.ex03.case05.domain.Score;

public interface ScoreDao {

	void setScore(Score score); 	//학생 1명의 점수 정보 입력 
	Score[] getScores(); 			//점수표 읽는 기능 
}
