package ch01.quiz02.case01;

public class ScoreParent {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	//  Getter/Setter
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
		this.avg = this.total / 3;
	}
	
	

}
