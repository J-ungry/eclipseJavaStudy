package ch03.quiz.project02.service;

import java.util.ArrayList;

import ch03.quiz.project02.dao.EmployeeDao;
import ch03.quiz.project02.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	//dao 랑 서비스 연결 (has-a 관계)
	private EmployeeDao employeeDao;
	
	//생성자 
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
	this.employeeDao = employeeDao;
}

	@Override
	public void addEmployee(Employee employee) {
		this.employeeDao.setEmployee(employee);
		
	}

	@Override
	public ArrayList<Employee> getEmployees() {
		ArrayList<Employee> employees = this.employeeDao.getEmployees();
		return employees;
	}

	@Override
	public void modifyEmployee(int index, Employee employee) {
		this.employeeDao.modifyEmployee(index, employee);
		
	}

	@Override
	public void deleteEmployee(int index) {
		this.employeeDao.deleteEmployee(index);
		
	}
}
