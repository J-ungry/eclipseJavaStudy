package ch03.quiz.project02.dao;

import java.util.ArrayList;

import ch03.quiz.project02.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private ArrayList<Employee> employees; //직원들 정보 
	
	public EmployeeDaoImpl(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public void setEmployee(Employee employee) {
		this.employees.add(employee);
		
	} 
	

	@Override
	public ArrayList<Employee> getEmployees() {
		return this.employees;  //직원들정보 들어간거 가져가기 (service 에서 이제 바꾸고 다시 저장해ㅑㅇ하나 ?)
	}
	
	@Override
	public void modifyEmployee(int index,Employee employee) {
		this.employees.set(index, employee);
	}
	
	@Override 
	public void deleteEmployee(int index) {
		this.employees.remove(index);
	}

}
