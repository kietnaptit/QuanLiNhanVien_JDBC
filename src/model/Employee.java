package model;

import java.math.BigInteger;
import java.util.Date;

public class Employee {
	private int empId;
	private int deptId;
	private String empName;
	private String empNo;
	private Date hireDate;
	private byte[] image;
	private String job;
	private java.math.BigInteger mngId;
	private float salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public java.math.BigInteger getMngId() {
		return mngId;
	}
	public void setMngId(java.math.BigInteger mngId) {
		this.mngId = mngId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Employee(int empId, int deptId, String empName, String empNo, Date hireDate, byte[] image, String job,
			BigInteger mngId, float salary) {
		super();
		this.empId = empId;
		this.deptId = deptId;
		this.empName = empName;
		this.empNo = empNo;
		this.hireDate = hireDate;
		this.image = image;
		this.job = job;
		this.mngId = mngId;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	

}
