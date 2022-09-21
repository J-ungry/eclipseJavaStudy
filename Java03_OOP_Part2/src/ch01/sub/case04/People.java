package ch01.sub.case04;

public class People {

	protected String name; //상속관계인 애들한테는 다 보인다 
	protected int age;
	protected String email;
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
