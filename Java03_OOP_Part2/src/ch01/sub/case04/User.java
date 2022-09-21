package ch01.sub.case04;

public class User extends People{

	private String id;
	private String pw;
	
	
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		String msg = name+ ", "+
						age+", "+
						email+", ";
		return msg;
	}
}
