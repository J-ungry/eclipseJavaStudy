package ch03.quiz.project02Answer.service.employee;

import java.util.List;

import ch03.quiz.project02Answer.dao.employee.EmployeeDao;
import ch03.quiz.project02Answer.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao empDao;
	
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	//구현해야 할 것들 
	@Override
	public List<Employee> listEmployees() {
		return empDao.getEmployees();
	}

	@Override
	public Employee findEmployee(int empId) {
		return empDao.getEmployee(empId);
	}

	@Override
	public boolean addEmployee(Employee emp) {
		return empDao.insertEmployee(emp);
	}

	@Override
	public boolean modEmployee(Employee emp) {
		return empDao.updateEmployee(emp);
	}

	@Override
	public boolean delEmployee(int empId) {
		return empDao.deleteEmployee(empId);
	}
}
