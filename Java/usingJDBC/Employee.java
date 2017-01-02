package usingJDBC;

public class Employee {// creating employee object
	private int Employeeno;
	private String DOB ;
	private String FirstName;
	private String LastName;
	private String gender;
	private String hire_date;
	public int getEmployeeno() {
		return Employeeno;
	}
	public void setEmployeeno(int employeeno) {
		Employeeno = employeeno;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHire_date() {
		return hire_date;
	}
	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}
	
}
