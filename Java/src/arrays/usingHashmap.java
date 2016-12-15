package arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class usingHashmap {
	 static HashMap<  String, Integer> StudentDetails = new HashMap<String, Integer>(); // can store the key and value
	
	 static void addToArray(String stdName, int rollNumber){
			StudentDetails.put( stdName, rollNumber);
	}
	 
	 /* To fetch the values from hashmap the following steps are required
	   Step 1:Get the set of key-value pairs by calling entrySet() method
	   Step:2 obtaining iterator for the key-value pairs 
	   Step:3 use Map.Entry interface to fetch the key and value*/
	 
	 static void printStdDetails()
	 {
		Set set = StudentDetails.entrySet(); // getting key-value pairs 
		Iterator i = set.iterator(); // obtaining iterator for the key-value pairs
		while(i.hasNext())
		{
			Map.Entry keyValue= (Map.Entry)i.next();
			System.out.println("StudentName: "+keyValue.getKey());
			System.out.println("Student RollNumber: "+keyValue.getValue());
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
