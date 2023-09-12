package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.TimeKeeper;

public class TimeKeeperDAO {
	private DAO dao = new DAO();
	
	public TimeKeeperDAO() {};
	
	private static String GET_ALL_TIMEKEEPER = "SELECT * FROM TIMEKEEPER";
	
	public List<TimeKeeper> getAllTimeKeeper(){
		List<TimeKeeper> timeKeepers = new ArrayList<>();
		try {
			Connection connection = dao.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(GET_ALL_TIMEKEEPER);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				TimeKeeper timeKeeper = new TimeKeeper();
				timeKeeper.setDate_time(resultSet.getDate("Date_Time"));
				timeKeeper.setEmp_id(resultSet.getLong("EMP_ID"));
				timeKeeper.setId(resultSet.getString("Timekeeper_Id"));
				timeKeeper.setIn_out(resultSet.getString("In_Out"));
				timeKeepers.add(timeKeeper);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return timeKeepers;
		
	}

}
