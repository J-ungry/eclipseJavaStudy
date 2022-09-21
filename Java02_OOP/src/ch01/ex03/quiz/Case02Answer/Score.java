package ch01.ex03.quiz.Case02Answer;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTotal() {
		return total;
	}
	public double getAvg() {
		return avg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setTotal() {
		this.total = this.kor+this.eng+this.math;
	}
	public void setAvg() {
		this.avg = this.total/3.0;
	}
}
