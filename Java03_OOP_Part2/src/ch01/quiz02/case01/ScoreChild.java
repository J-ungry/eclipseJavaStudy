package ch01.quiz02.case01;

public class ScoreChild extends ScoreParent{
	
	private int music;
	private int pe;
	
	
	
	public int getMusic() {
		return music;
	}

	public int getPe() {
		return pe;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public void setPe(int pe) {
		this.pe = pe;
	}

	@Override
	public int getTotal() {
		// TODO Auto-generated method stub
		int total = super.getTotal() + music + pe;
		return total;
	}
	
	@Override
	public double getAvg() {
		int avg = getTotal()/5;
		return avg;
	}
	
	@Override
	public String toString() {
		String msg = "### " + super.getName() + " ###\n";
		msg += "총점 : "+getTotal() + "\n";
		msg += "평균 : "+getAvg() + "\n";
		return msg;
	}
	
}
