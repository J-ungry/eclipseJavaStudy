package ch03.quiz.project02Answer.service.employee;

import java.util.List;

import ch03.quiz.project02Answer.domain.Employee;

public interface EmployeeService {

	List<Employee> listEmployees();			// 사원 목록 조회 
	Employee findEmployee(int empId); 		//사원 1명 읽기 
	
	boolean addEmployee(Employee emp);	// 사원 1명 추가
	boolean modEmployee(Employee emp);	// 사원 1명 수정 
	boolean delEmployee(int empId);		// 사원 1명 삭제
}
