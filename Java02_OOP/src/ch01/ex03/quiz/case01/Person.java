package ch01.ex03.quiz.case01;

import java.time.LocalDate;

public class Person {

	//fields
	private String name;
	private int age;
	private LocalDate orderDate;
	
	
	//get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
//		this.orderDate = LocalDate.now();;
		this.orderDate = orderDate;
	}
	
	
}
