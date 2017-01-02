package arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class UsingHashSet {

	static HashSet _studentName = new HashSet();
	static HashSet _studentRoll = new HashSet();
	
	 static void addToArray(String stdName, int rollNumber){
			_studentName.add(stdName);
			_studentRoll.add(rollNumber);
	}
	 
	 
	 static void printStdDetails()
	 {
		System.out.println("Student Names: "+ _studentName); 
		System.out.println("Student Roll Numebers"+ _studentRoll);
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
