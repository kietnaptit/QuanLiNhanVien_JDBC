package dao;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Employee;

public class EmployeeDAO {
	private DAO dao = new DAO();
	
	public EmployeeDAO() {};
	
	private static String GET_ALL_EMP = "SELECT * FROM EMPLOYEE";
	private static String GET_AN_EMP_BY_ID = "SELECT * FROM EMPLOYEE WHERE EMP_ID = ?";
	private static String ADD_AN_EMP = "INSERT INTO EMPLOYEE (EMP_ID, EMP_NAME, EMP_NO, HIRE_DATE, IMAGE, JOB, SALARY, DEPT_ID, MNG_ID)VALUES (?,?,?,?,?,?,?,?,?)";
	private static String UPDATE_AN_EMP = "UPDATE EMPLOYEE set EMP_NAME = ?,EMP_NO = ?,HIRE_DATE = ?,IMAGE= ?,JOB= ?,SALARY = ?,DEPT_ID = ?,MNG_ID= ? Where EMP_ID = ?";
	
	public List<Employee> getAllEmp(){
		List<Employee> employees = new ArrayList<>();
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_EMP);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Employee employee = new Employee();
				employee.setEmpName(resultSet.getString("EMP_NAME"));
				employee.setDeptId(resultSet.getInt("DEPT_ID"));
				employee.setEmpId(resultSet.getInt("EMP_ID"));
				employee.setEmpNo(resultSet.getString("EMP_NO"));
				employee.setHireDate(resultSet.getDate("HIRE_DATE"));
				employee.setImage(resultSet.getBytes("IMAGE"));
				employee.setJob(resultSet.getString("JOB"));
				employee.setMngId(BigInteger.valueOf(resultSet.getInt("MNG_ID")));
				employee.setSalary(resultSet.getFloat("SALARY"));
				employees.add(employee);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	public Employee getAnEmpByID(String id) {
		Employee employee = new Employee();
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_AN_EMP_BY_ID);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				employee.setEmpName(resultSet.getString("EMP_NAME"));
				employee.setDeptId(resultSet.getInt("DEPT_ID"));
				employee.setEmpId(resultSet.getInt("EMP_ID"));
				employee.setEmpNo(resultSet.getString("EMP_NO"));
				employee.setHireDate(resultSet.getDate("HIRE_DATE"));
				employee.setImage(resultSet.getBytes("IMAGE"));
				employee.setJob(resultSet.getString("JOB"));
				employee.setMngId(BigInteger.valueOf(resultSet.getInt("MNG_ID")));
				employee.setSalary(resultSet.getFloat("SALARY"));				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}
	
	public boolean addNewEmp(Employee employee) {
		boolean result = false;
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(ADD_AN_EMP);
			preparedStatement.setInt(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setString(3, employee.getEmpNo());
			preparedStatement.setDate(4, new java.sql.Date(employee.getHireDate().getTime()));
			preparedStatement.setBytes(5, employee.getImage());
			preparedStatement.setString(6, employee.getJob());
			preparedStatement.setFloat(7, employee.getSalary());
			preparedStatement.setInt(8, employee.getDeptId());
			preparedStatement.setLong(9, employee.getMngId().longValue());
			preparedStatement.execute();
			preparedStatement.close();
			result = true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean editAnEmp(String id, Employee employee) {
		boolean result = false;
		//set EMP_NAME = ?,EMP_NO = ?,HIRE_DATE = ?,IMAGE= ?,JOB= ?,SALARY = ?,DEPT_ID = ?,MNG_ID= ? Where EMP_ID = ?";
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_AN_EMP);
			preparedStatement.setString(1, employee.getEmpName());
			preparedStatement.setString(2, employee.getEmpNo());
			preparedStatement.setDate(3, new java.sql.Date(employee.getHireDate().getTime()));
			preparedStatement.setBytes(4, employee.getImage());
			preparedStatement.setString(5, employee.getJob());
			preparedStatement.setFloat(6, employee.getSalary());
			preparedStatement.setInt(7, employee.getDeptId());
			preparedStatement.setLong(8, employee.getMngId().longValue());
			preparedStatement.setInt(9, employee.getEmpId());
			preparedStatement.execute();
			preparedStatement.close();
			result = true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
