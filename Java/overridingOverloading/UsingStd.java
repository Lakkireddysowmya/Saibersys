package overridingOverloading;
import overridingOverloading.Student;
public class UsingStd extends Student{ // to create a overriding method must use extend keyword to extend parent class
void studentDetails(String Name)
{
	System.out.println("Name of the student is: "+Name);
}
// overloading
void studentDetails(String Name, int RollNo) // creating a method with same name but with different parameters
{
	System.out.println("Name of the student: "+ Name +"Roll number"+RollNo);
}
static void Grade(int math) 
{
	System.out.println("Math Marks: "+ math);
	
}
static void Grade(char finalGrade){// can also create static method overloading
	
}

//overriding the parent method( by using same method name)
public void studentAddress() 
{
	System.out.println("In child class");
}


public static void main(String[] args) { // program executes from main method. 
	String studentName = "Abhishek";
	int rollNumber = 101145, grade= 95;
	// as the methods are not static must create object
	UsingStd obj = new UsingStd();
	obj.studentDetails(studentName);
	obj.studentDetails(studentName,rollNumber);
	Grade(grade); //static method; no object required
	obj.studentAddress(); 
}

}
