package view;

import java.util.List;
import java.util.Scanner;

import controller.DepartmentController;
import model.Department;

public class DepartmentView {
	static DepartmentController controller = new DepartmentController();
	public static void printAllDept() {
		List<Department> departments = controller.getAllDept();
		System.out.println("DEPT_ID | DEPT_NAME | DEPT_NO | LOCATION");
		for(Department department : departments) {
			System.out.println(department.getId() + " | " + department.getName()+ " | " + department.getNo()+ " | " + department.getLocation() );
		}
	}
	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		System.out.println("DEPARTMENT MANAGEMENT");
		System.out.println("1. Show all department");
		System.out.print("Input the choice: ");
		int choice = Integer.parseInt(cin.nextLine());
		if(choice == 1) {
			printAllDept();
		}
		

	}

}
