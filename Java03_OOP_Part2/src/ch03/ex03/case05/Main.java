package ch03.ex03.case05;

import ch03.ex03.case05.dao.score.ScoreDao;
import ch03.ex03.case05.dao.score.ScoreDaoImpl;
import ch03.ex03.case05.domain.Score;
import ch03.ex03.case05.presentation.Console;
import ch03.ex03.case05.presentation.score.ScoreIo;
import ch03.ex03.case05.service.score.ScoreService;
import ch03.ex03.case05.service.score.ScoreServiceImpl;

public class Main {

	public static void main(String[] args) {

		int studentCount = 0;
		Score[] scores; //점수표 
		
		studentCount = Console.inNumber("학생 수를 입력하세요 : ");
		scores = new Score[studentCount];
		
		//연결 연결 연결 
		ScoreDao scoreDao = new ScoreDaoImpl(scores);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.run(studentCount);
		
		Console.showInfo("끗 ! ");
	}

}
