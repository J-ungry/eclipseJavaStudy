package ch03.quiz.project02Answer.domain;

import java.time.LocalDate;

public class Employee {

	//field
	private int empId;			//사원 아이
	private String empName;		//사원명 
	private LocalDate hireDate; // 입사일 
	
	//생성자 
	public Employee(String empName, LocalDate hireDate) {
		super();
		this.empName = empName;
		this.hireDate = hireDate;
	}

	//getter,setter
	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	@Override
	public String toString() {
		return String.format("%2d %-5s %s \n", empId,empName,hireDate);
	}
	
	
}
