package controller;

import java.util.List;

import dao.EmployeeDAO;
import model.Employee;

public class EmployeeController {
	private EmployeeDAO employeeDAO = new EmployeeDAO();
	
	public EmployeeController() {};
	
	public List<Employee> getAllEmp(){
		List<Employee> employees = employeeDAO.getAllEmp();
		return employees;
	}
	
	public Employee getAnEmpByID(String id) {
		Employee employee = employeeDAO.getAnEmpByID(id);
		return employee;
	}
	
	public Boolean addAnEmp(Employee employee) {
		boolean result = employeeDAO.addNewEmp(employee);
		return result;
	}
	
	public Boolean editEmp(String id, Employee employee) {
		boolean result = employeeDAO.editAnEmp(id, employee);
		return result;
	}
	

}
