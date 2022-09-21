package ch03.quiz.case04.domain;

public class User {

	//fields
	private String userName;

	//생성자 
	public User(String userName) {
		this.userName = userName;
	}
	
	@Override 
	public String toString() {
		return userName;
	}
	

	
}
