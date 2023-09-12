package controller;

import java.util.List;

import dao.TimeKeeperDAO;
import model.TimeKeeper;

public class TimeKeeperController {
	private TimeKeeperDAO timeKeeperDAO = new TimeKeeperDAO();
	
	public TimeKeeperController() {} ;

	public List<TimeKeeper> getAllTimeKeeper(){
		List<TimeKeeper> timeKeepers = timeKeeperDAO.getAllTimeKeeper();
		return timeKeepers;
	}
}
