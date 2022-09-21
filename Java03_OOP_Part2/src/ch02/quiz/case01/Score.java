package ch02.quiz.case01;

public class Score {

	private String name;
	private int kor;
	private int eng;
	private int ma;
	private int total;
	private int avg;
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMa() {
		return ma;
	}
	public int getTotal() {
		return total;
	}
	public int getAvg() {
		return avg;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public void setTotal(int kor,int eng,int ma) {
		this.total = kor+eng+ma;
	}
	public void setAvg(int total) {
		this.avg = total/3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	
	
	
}
