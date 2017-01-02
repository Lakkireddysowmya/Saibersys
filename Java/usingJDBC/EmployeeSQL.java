package usingJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSQL  {
	private static Connection connection ;
	static List<Employee> list = new ArrayList<Employee>();
	public static void main(String[] args) throws DBException, SQLException { //throws personalized exception from the class DBException
		
	
	try{
	 connection = DriverManager.getConnection( // connections made using the DriverManager.
			 "jdbc:sqlserver://localhost;integratedSecurity=true");
     
 } catch(SQLException e) {
     throw new DBException(e);
 }
	getAllRowsFromEmpTable();
	}
	private static void getAllRowsFromEmpTable() throws SQLException {
		String sql="Select * from employees.Employee;"; // SQL query to fetch all the values from the table
		PreparedStatement ps = connection.prepareStatement(sql); // throws exception
		ResultSet result = ps.executeQuery(); // after executing the query sends the result to result set
		
		// fetching values from result set
		while(result.next())
		{
			int Employeeno = result.getInt("emp_no"); // getting the values from the employee table from the column emp_no
			String DOB = result.getString("birth_date");
			String FirstName = result.getString("first_name");
			String LastName = result.getString("last_name");
			String gender = result.getString("gender");
			String hire_date = result.getString("hire_date");
			// can be printed directly using system.out.println
			
			//storing the values inside the list 
			Employee e = new Employee();
			e.setEmployeeno(Employeeno);
			e.setDOB(DOB);
			e.setFirstName(FirstName);
			e.setLastName(LastName);
			e.setGender(gender);
			e.setHire_date(hire_date);
			list.add(e);
		}
		printvalues();
		 
	}
	private static void printvalues() {
		for(Employee e : list)
		{
			System.out.println("Employee num:"+ e.getEmployeeno());
			System.out.println("Employee name"+ e.getFirstName());
		}
		
	}
	
 }            


