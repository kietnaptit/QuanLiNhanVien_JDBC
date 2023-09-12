package model;

public class SalaryGrade {
	private int grade;
	private float high_salary;
	private float low_salary;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public float getHigh_salary() {
		return high_salary;
	}
	public void setHigh_salary(float high_salary) {
		this.high_salary = high_salary;
	}
	public float getLow_salary() {
		return low_salary;
	}
	public void setLow_salary(float low_salary) {
		this.low_salary = low_salary;
	}
	public SalaryGrade(int grade, float high_salary, float low_salary) {
		super();
		this.grade = grade;
		this.high_salary = high_salary;
		this.low_salary = low_salary;
	}
	public SalaryGrade() {
		super();
	}
	
	

}
