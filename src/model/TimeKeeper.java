package model;

import java.math.BigInteger;
import java.sql.Date;

public class TimeKeeper {
	private String id;
	private Date date_time;
	private String in_out;
	private long emp_id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate_time() {
		return date_time;
	}
	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}
	public String getIn_out() {
		return in_out;
	}
	public void setIn_out(String in_out) {
		this.in_out = in_out;
	}
	public long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}
	public TimeKeeper() {
		super();
		
	}
	

}
