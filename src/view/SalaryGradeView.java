package view;

import java.util.List;
import java.util.Scanner;

import controller.SalaryGradeController;
import model.SalaryGrade;

public class SalaryGradeView {
	static SalaryGradeController controller = new SalaryGradeController();
	public static void printAllSalaryGrade() {
		List<SalaryGrade>salaryGrades = controller.getAllSalaryGrades();
		System.out.println("GRADE | HIGH_SALARY | LOW_SALARY");
		for(SalaryGrade salaryGrade : salaryGrades) {
			System.out.println(salaryGrade.getGrade() + " | " + salaryGrade.getHigh_salary() + " | " + salaryGrade.getLow_salary());
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("SALARY GRADE MANAGEMENT");
		System.out.println("1. Show all salary grade");
		System.out.print("Input the choice: ");
		int choice = Integer.parseInt(cin.nextLine());
		if(choice == 1) {
			printAllSalaryGrade();
		}
	}

}
