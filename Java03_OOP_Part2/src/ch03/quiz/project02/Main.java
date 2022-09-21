package ch03.quiz.project02;

import java.util.ArrayList;

import ch03.quiz.project02.dao.EmployeeDao;
import ch03.quiz.project02.dao.EmployeeDaoImpl;
import ch03.quiz.project02.domain.Employee;
import ch03.quiz.project02.presentation.employee.EmployeeIo;
import ch03.quiz.project02.service.EmployeeService;
import ch03.quiz.project02.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		String[] empMenuItem = {"사원 목록","추가","수정","삭제","종료"};
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		EmployeeDao empDao = new EmployeeDaoImpl(empList);
		EmployeeService empService = new EmployeeServiceImpl(empDao);
		EmployeeIo empIo = new EmployeeIo(empService, empMenuItem);
		
		empIo.play();
	}

}
