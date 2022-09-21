package ch03.quiz.project02Answer.dao.employee;

import java.util.List;

import ch03.quiz.project02Answer.domain.Employee;

public interface EmployeeDao {
	
	List<Employee> getEmployees();			// 사원 목록 조회 
	Employee getEmployee(int empId); 		//사원 1명 읽기 
	
	boolean insertEmployee(Employee emp);	// 사원 1명 추가
	boolean updateEmployee(Employee emp);	// 사원 1명 수정 
	boolean deleteEmployee(int empId);		// 사원 1명 삭제
	
}
