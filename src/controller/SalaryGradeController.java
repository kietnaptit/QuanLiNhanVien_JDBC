package controller;

import java.util.ArrayList;
import java.util.List;

import dao.SalaryGradeDAO;
import model.SalaryGrade;

public class SalaryGradeController {
	private SalaryGradeDAO salaryGradeDAO = new SalaryGradeDAO();
	
	public SalaryGradeController() {};

	public List<SalaryGrade> getAllSalaryGrades(){
		List<SalaryGrade> salaryGrades = salaryGradeDAO.getAllSalaryGrade();
		return salaryGrades;
		
	}

}
