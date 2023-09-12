package model;
// Mỗi phòng ban DEPARTMENT(DEPT_ID, DEPT_NAME, DEPT_NO, LOCATION)

public class Department {
	private int id;
	private String name;
	private String no;
	private String location;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Department(int id, String name, String no, String location) {
		super();
		this.id = id;
		this.name = name;
		this.no = no;
		this.location = location;
	}
	public Department() {
		super();
	}
	
}
