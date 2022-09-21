package ch02.ex02.quiz.quiz01;

public class Taxi {

	private String name;
	private int money;
	
	public Taxi() {
		this("카카오",0);
	}
	public Taxi(String name,int money) {
		this.name= name;
		
		this.money = money;
	}
	
	
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void output() {
		System.out.printf("%s 사의 수입은 %d 입니다\n",name,money);
	}
	
	
	
	
}
