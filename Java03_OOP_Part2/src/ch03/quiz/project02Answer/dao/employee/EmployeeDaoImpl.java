package ch03.quiz.project02Answer.dao.employee;

import java.util.List;

import ch03.quiz.project02Answer.domain.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private List<Employee> empList; //has-a
	private int empIdSeq;		//사원 번호를 1씩 증가 
	
	public EmployeeDaoImpl(List<Employee> empList) {
		this.empList = empList;
		empIdSeq = 1;
	}

	@Override
	public List<Employee> getEmployees() {
		return empList;
	}

	@Override
	public Employee getEmployee(int empId) { //사원 한명씩 조회 
		Employee emp = null;
		
		for(Employee temp : empList) {
			if(temp.getEmpId()==empId) {
				emp = temp;
				break;
			}
		}
		return emp;
	}

	@Override
	public boolean insertEmployee(Employee emp) { //사원 추가하기 
		emp.setEmpId(empIdSeq++); //입력이 되고 후위 연산자라 그 다음거에 1씩 증가하게 된다 
		return empList.add(emp);
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		Employee employee = null;
		
		for(Employee temp : empList) {
			if(temp.getEmpId() == emp.getEmpId()) {
				employee = temp; // 일치하는 temp 를 담는다 
				break;
			}
		}
		
		employee.setEmpName(emp.getEmpName());
		employee.setHireDate(emp.getHireDate());
		
		return true;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean isDel = false;
		Employee emp = null; //객체 담을 상자 
		for(int i=0; i<empList.size();i++) {
			emp = empList.get(i); //첫번쨰 방부터 하나씩 emp 에 담는다 
			if(emp.getEmpId() == empId) {
				isDel = empList.remove(emp);
				break;
			}
		}
		
		
		return isDel;
	}

}
