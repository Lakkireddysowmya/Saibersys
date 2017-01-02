package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;




public class arrayListCollection {
	static List<String> _studentName = new ArrayList<String>(); //import java.util.ArrayList;  import java.util.List;
	static List<Integer> _studentroll = new LinkedList<Integer>(); // cannot add int to list. instead use Integer class (autoboxing)
	static void addToArray(String stdName, int rollNumber){
		_studentName.add(stdName);
		_studentroll.add(rollNumber);
				
	}
	
	static void printStdDetails()
	{
		for(String i : _studentName) //foreach loop to retrieve values from arraylist
		{
			System.out.println("Student Name: " + i);
			
		}
		for(int j: _studentroll) // for each to retrieve values from linked list.
		{
			System.out.println("Student RollNumber: "+j);
			
		}
	}
	

 public static void main(String[] args) { 
	 Scanner scanner = new Scanner(System.in); // reads value from the console. import from java.util.Scanner;
		for(int i =0; i<5; i++){		
		System.out.println("Please enter student Name: ");
		 String stdName =scanner.nextLine();
		addToArray(stdName, i); //calling method to add
		}
		 
		printStdDetails();
		System.out.println("*********End******");
		
	
}
}
