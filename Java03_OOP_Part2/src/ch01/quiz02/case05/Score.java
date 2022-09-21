package ch01.quiz02.case05;

public class Score {
	private int ko;
	private int en;
	private int ma;
	private int sum;
	private double avg;
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getEn() {
		return en;
	}
	public void setEn(int en) {
		this.en = en;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public int getSum() {
		return sum;
	}
	public void setSum() {
		this.sum = ko + en + ma;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg() {
		this.avg = sum / 3.0;
	}
	
	
}