package view;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import controller.EmployeeController;
import model.Employee;

public class EmployeeView {
	static EmployeeController controller = new EmployeeController();
	public static void printAllEmp() {
		List<Employee> employees = controller.getAllEmp();
		System.out.println("EMP_ID | EMP_NAME | EMP_NO | HIRE_DATE | IMAGE | JOB | SALARY | DEPT_ID | MNG_ID");
		for(Employee employee : employees) {
			System.out.println(employee.getEmpId() + " | " + employee.getEmpName() + " | " + employee.getEmpNo() + " | " + employee.getHireDate() + " | " + employee.getImage() + " | " + employee.getJob() + " | " + employee.getSalary() + " | " + employee.getDeptId() + " | " + employee.getMngId());
		}
	}
	public static Employee printDetail(String id) {
		Employee employee = controller.getAnEmpByID(id);
		return employee;
	}
	public static boolean addNewEmp(Employee e) {
		return controller.addAnEmp(e);
	}
	
	public static boolean editEmp(String id, Employee e) {
		return controller.editEmp(id, e);
	}
	public static void main(String[] args) throws ParseException {
		Scanner cin = new Scanner(System.in);
		System.out.println("EMPLOYEE MANAGEMENT");
		System.out.println("1. Show all employee");
		System.out.println("2. View details of an Employee");
		System.out.println("3. Add a new employee");
		System.out.println("4. Edit a new employee");
		System.out.print("Input the choice: ");
		int choice = Integer.parseInt(cin.nextLine());
		if(choice == 1) {
			printAllEmp();
		}else if(choice == 2) {
			System.out.println("List of employees");
			printAllEmp();
			System.out.print("Enter the ID of employee to see detail: ");
			String id = cin.nextLine();
			Employee employee = printDetail(id);
			System.out.println("EMP_ID: " + employee.getEmpId());
			System.out.println("EMP_NAME: " + employee.getEmpName());
			System.out.println("EMP_NO: " + employee.getEmpNo());
			System.out.println("HIRE_DATE: " + employee.getHireDate());
			System.out.println("IMAGE: " + employee.getImage());
			System.out.println("JOB: " + employee.getJob());
			System.out.println("SALARY: " + employee.getSalary());
			System.out.println("DEPT_ID: " + employee.getDeptId());
			System.out.println("MNG_ID: " + employee.getMngId());
		}else if(choice == 3) {
			Employee employee = new Employee();
			System.out.print("Enter EMP_ID: ");
			employee.setEmpId(Integer.parseInt(cin.nextLine()));
			System.out.print("Enter EMP_NAME: ");
			employee.setEmpName(cin.nextLine());
			System.out.print("Enter EMP_NO: ");
			employee.setEmpNo(cin.nextLine());
			System.out.print("Enter HIRE_DATE: ");
			SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
			employee.setHireDate(formatter.parse(cin.nextLine()));
			System.out.println("Enter IMAGE: ");
			System.out.print("Enter JOB: ");
			employee.setJob(cin.nextLine());
			System.out.print("Enter SALARY: ");
			employee.setSalary(Float.parseFloat(cin.nextLine()));
			System.out.print("Enter DEPT_ID: ");
			employee.setDeptId(Integer.parseInt(cin.nextLine()));
			System.out.print("Enter MNG_ID: ");
			employee.setMngId(BigInteger.valueOf(Long.parseLong(cin.nextLine())));
			System.out.println("Waiting for adding");
			if(addNewEmp(employee)) {
				System.out.println("Adding successfully");
			}else {
				System.out.println("Failed. Check again");
			}

		}else if(choice == 4) {
			System.out.println("List of employees");
			printAllEmp();
			System.out.print("Enter the ID of employee to edit detail: ");
			String id = cin.nextLine();
			Employee employee = new Employee();
			System.out.print("Enter EMP_NEW_NAME: ");
			employee.setEmpName(cin.nextLine());
			System.out.print("Enter EMP_NEW_NO: ");
			employee.setEmpNo(cin.nextLine());
			System.out.print("Enter HIRE_NEW_DATE: ");
			SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
			employee.setHireDate(formatter.parse(cin.nextLine()));
			System.out.println("Enter IMAGE: ");
			System.out.print("Enter JOB: ");
			employee.setJob(cin.nextLine());
			System.out.print("Enter SALARY: ");
			employee.setSalary(Float.parseFloat(cin.nextLine()));
			System.out.print("Enter DEPT_NEW_ID: ");
			employee.setDeptId(Integer.parseInt(cin.nextLine()));
			System.out.print("Enter MNG_NEW_ID: ");
			employee.setMngId(BigInteger.valueOf(Long.parseLong(cin.nextLine())));
			System.out.println("Waiting for editing");
			if(editEmp(id, employee)) {
				System.out.println("Edit successfully");
			}else {
				System.out.println("Failed. Check again");
			}
		}

	}

}
