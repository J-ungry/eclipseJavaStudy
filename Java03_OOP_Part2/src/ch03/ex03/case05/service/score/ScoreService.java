package ch03.ex03.case05.service.score;

import ch03.ex03.case05.domain.Score;

public interface ScoreService {

	void addScore(Score score);
	Score[] listScores();
}
