package ch03.quiz.project02.domain;

public class Employee {
	//fields
	private int id;
	private String name;
	private String date;
	
	
	//getter,setter
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDate() {
		return date;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return String.format("%3d %4s %4s",id,name,date);
	}
	

}
