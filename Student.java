/*
 * Student Object Class with constructors,
 * setters, and getters
 */

public class Student {
	
	private Integer rollNum;
	private String name;
	private String address;
	
	//Default Constructor
	public Student() {
		rollNum = 0;
		name = "Empty";
		address = "No Address";
	}
	
	//Constructor with parameters
	public Student(Integer rollNum, String name, String address) {
		this.rollNum = rollNum;
		this.name = name;
		this.address = address;
	}
	/*
	@Override
	public int compareTo(Student student) {
		return this.getRollNum().compareTo(student.getRollNum());
	}
	
	
	 public boolean isLessThan(Student student) { boolean isLess = false;
	 if(this.getRollNum().compareTo(student.getRollNum()) < 0) { isLess = true; }
	 return isLess; }
	 */
	
	
	/**
	 * @return the rollNum
	 */
	public Integer getRollNum() {
		return rollNum;
	}
	/**
	 * @param rollNum the rollNum to set
	 */
	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
