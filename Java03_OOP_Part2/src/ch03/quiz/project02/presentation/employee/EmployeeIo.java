package ch03.quiz.project02.presentation.employee;

import java.util.ArrayList;
import java.util.Scanner;

import ch03.quiz.project02.domain.Employee;
import ch03.quiz.project02.presentation.Console;
import ch03.quiz.project02.service.EmployeeService;

public class EmployeeIo {
	
	Scanner sc = new Scanner(System.in);
	private EmployeeService employeeService;
	private String[] empMenuItem;
	private int id = 0;
	//생성자 
	public EmployeeIo(EmployeeService employeeService, String[] empMenuItem) {
		this.employeeService = employeeService;
		this.empMenuItem = empMenuItem;
	}
	
	public void play() {
		ArrayList<Employee> employees =null;
		while(true) {
			
			switch(Console.menu(empMenuItem)) {
			case 2:
				Employee employee = new Employee();// 객체 생성 
				employee.setId(++id);
				System.out.print("이름 입력하기 >> ");
				employee.setName(sc.next());
				System.out.println("입사일 입력하기 ex)1998-03-10 >> ");
				employee.setDate(sc.next());
				employeeService.addEmployee(employee); //생성한거 arrayList 에 넣기 
				System.out.println("SUCCESS ) 사원 추가 완료 !");
				break;
			case 1:
				employees = employeeService.getEmployees(); //어레이 담아주기 
				
				Console.showInfo("ID\t이름\t입사일\t");
				System.out.println("--------------------------------------");
				if(employees.size()==0) { //만약 내용이 없다면 
					System.out.println("안에 내용이 없쪄요 ");
					break;
				}
				for(Employee e : employees) {
					System.out.println(e);
				}
				break;
			case 3:
				employees = employeeService.getEmployees();
				boolean check = false;
				if(employees.size()==0) { //만약 내용이 없다면 
					System.out.println("안에 내용이 없쪄요 ");
					break;
				}
				System.out.println("수정할 사원 ID 를 입력하세요");
				System.out.print("> ");
				int id = sc.nextInt();
				for(Employee e : employees) {
					if(e.getId() == id) {
						System.out.println("사원 이름을 입력하세요 ");
						System.out.print("> ");
						e.setName(sc.next());
						
						System.out.println("사원 입사일을 입력하세요 ");
						System.out.print("> ");
						e.setDate(sc.next());
						
						System.out.println("SUCCESS ) 사원 수정 완료 !");
						check = true;
					}
				} if(!check) {System.out.println("ERROR) 입력한 ID의 사원이 없습니다.");}
				else {
					break;
				}

			case 4:
				employees = employeeService.getEmployees();
				boolean delCheck = false;
				if(employees.size()==0) { //만약 내용이 없다면 
					System.out.println("안에 내용이 없쪄요 ");
					break;
				}
				System.out.println("수정할 사원 ID 를 입력하세요");
				System.out.print("> ");
				int delId = sc.nextInt();
				for(Employee e : employees) {
					if(e.getId() == delId) {
						employeeService.deleteEmployee((delId-1));
						System.out.println("SUCCESS ) 사원 삭제 완료 !");
						delCheck = true;
					}
				}if(!delCheck) {System.out.println("ERROR) 입력한 ID의 사원이 없습니다.");}
				else {
					break;
				}

			case 5:
				System.out.println("프로그램 종료");
				return;
			}
		}

	}

}
