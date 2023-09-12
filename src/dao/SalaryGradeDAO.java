package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.SalaryGrade;

public class SalaryGradeDAO {
	private DAO dao = new DAO();
	
	public SalaryGradeDAO() {};
	
	private static String GET_ALL_SALARYGRADE = "SELECT * FROM SALARY_GRADE";
	
	public List<SalaryGrade> getAllSalaryGrade(){
		List<SalaryGrade> salaryGrades = new ArrayList<>();
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_SALARYGRADE);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				SalaryGrade salaryGrade = new SalaryGrade();
				salaryGrade.setGrade(resultSet.getInt("GRADE"));
				salaryGrade.setHigh_salary(resultSet.getFloat("HIGH_SALARY"));
				salaryGrade.setLow_salary(resultSet.getFloat("LOW_SALARY"));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return salaryGrades;
	}
}
