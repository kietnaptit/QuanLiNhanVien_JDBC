package controller;

import java.util.List;

import dao.DepartmentDAO;
import model.Department;

public class DepartmentController {
	private DepartmentDAO departmentDAO = new DepartmentDAO();
	public DepartmentController() {};
	
	public List<Department> getAllDept(){
		List<Department> departments = departmentDAO.getAllDept();
		return departments;
 	}

}
