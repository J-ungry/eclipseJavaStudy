package ch03.ex03.case05.domain;

public class Score {

	//fields
	private int scoreNo;
	private int koreanScore;
	private int englishScore;
	private int mathScore;
	
	private int sum;
	private int average;
	
	
	//getter,setter
	
	public int getScoreNo() {
		return scoreNo;
	}
	public int getKoreanScore() {
		return koreanScore;
	}
	public int getEnglishScore() {
		return englishScore;
	}
	public int getMathScore() {
		return mathScore;
	}
	public int getSum() {
		return sum;
	}
	public int getAverage() {
		return average;
	}
	public void setScoreNo(int scoreNo) {
		this.scoreNo = scoreNo;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setAverage(int average) {
		this.average = average;
		
	}
	
	@Override
	public String toString() {
		return String.format("%3d %4d %4d %4d %4d %4d ",scoreNo,koreanScore,englishScore,mathScore,sum,average);
	}
	
}
