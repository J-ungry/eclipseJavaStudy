package ch03.quiz.project02Answer.presentation.employee;

import java.time.LocalDate;
import java.util.List;

import ch03.quiz.project02Answer.presentation.Console;
import ch03.quiz.project02Answer.domain.Employee;
import ch03.quiz.project02Answer.service.employee.EmployeeService;

public class EmployeeIo {

	private EmployeeService empService;
	private String[] menuItem;
	
	//생성자 
	public EmployeeIo(EmployeeService empService, String[] menuItem) {
		this.empService = empService;
		this.menuItem = menuItem;
	}
	
	public void play() {
		int choice = 0;
		
		while(true) {
			switch(choice) {
			case 1: this.listEmployees(); break;
			case 2: this.addEmployee(); break;
			case 3: this.modEmplyee(); break;
			case 4: this.delEmployee(); break;
			}
		}
	}
	

	private void listEmployees() {
		List<Employee> empList = empService.listEmployees();
		
		System.out.println("ID     이름        입사일 ");
		System.out.println("-----------------------------------");
		if(empList.size() != 0) {
			for(Employee emp : empList) Console.info(emp);}
		else Console.info("사원이 없습니다 ");
		
	}
	
	private void addEmployee() {
		String empName = Console.inStr("사원의 이름을 입력하세요" );
		
		if(!empName.equals("0")) {
			LocalDate hireDate = Console.
		}
	}

	private void delEmployee() {
		// TODO Auto-generated method stub
		
	}

	private void modEmplyee() {
		// TODO Auto-generated method stub
		
	}



	
	
}
