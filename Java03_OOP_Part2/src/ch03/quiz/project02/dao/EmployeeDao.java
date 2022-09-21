package ch03.quiz.project02.dao;

import java.util.ArrayList;

import ch03.quiz.project02.domain.Employee;

public interface EmployeeDao {
	
	void setEmployee(Employee employee); 	//직원 정보 입력하기 (input)
	ArrayList<Employee> getEmployees(); 	//직원 정보 가져오기 (output)
	void modifyEmployee(int index,Employee employee);	//직원 정보 수정하기 (Modify)
	void deleteEmployee(int index);						//직원 정보 삭제하기 (delete)
	
	

}
