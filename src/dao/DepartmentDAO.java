package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Department;

public class DepartmentDAO {
	private DAO dao = new DAO();
	
	public DepartmentDAO() {};
	private static String GET_ALL_DEPT = "SELECT * FROM DEPARTMENT";
	
	public List<Department> getAllDept(){
		List<Department> departments = new ArrayList<>();
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_DEPT);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Department department = new Department();
				department.setId(resultSet.getInt("DEPT_ID"));
				department.setLocation(resultSet.getString("LOCATION"));
				department.setName(resultSet.getString("DEPT_NAME"));
				department.setNo(resultSet.getString("DEPT_NO"));
				departments.add(department);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return departments;
	}
	

}
