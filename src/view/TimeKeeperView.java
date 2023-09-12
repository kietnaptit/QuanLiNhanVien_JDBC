package view;

import java.util.List;
import java.util.Scanner;

import controller.TimeKeeperController;
import model.TimeKeeper;

public class TimeKeeperView {
	static TimeKeeperController controller = new TimeKeeperController();
	public static void printAllTimeKeeper() {
		List<TimeKeeper> timeKeepers = controller.getAllTimeKeeper();
		System.out.print("Timekeeper_Id | Date_Time | In_Out | EMP_ID");
		for(TimeKeeper timeKeeper : timeKeepers) {
			System.out.println(timeKeeper.getId() + " " + timeKeeper.getDate_time() + " " + timeKeeper.getIn_out() + " " + timeKeeper.getEmp_id());
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		System.out.println("TIMEKEEPER MANAGEMENT");
		System.out.println("1. Show all timekeeper");
		System.out.print("Input the choice: ");
		int choice = Integer.parseInt(cin.nextLine());
		if(choice == 1) {
			printAllTimeKeeper();
		}
	}

}
