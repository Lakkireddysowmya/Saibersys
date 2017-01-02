package pakage1;

public class MethodWithReturn { // always create a class name with capital letters
	String printString()
	{
		return "returning Hard coded value";
	}
	
	int printInt()
	{
		int k = 10; //Variable scope is within method only
		return k; // returning through value
	}

	double printDouble(double d) // return type with parameter
	{
		return d;
	}
	float printfloat()
	{
		float k = 5.2f; // a float value should always end with f 
		return k;
	}
	public static void main(String[] args) {
		MethodWithReturn m = new MethodWithReturn(); // creating an object to access the methods
		 String val = m.printString(); // as printString method returns a value, Created val to store the returned value
		 System.out.println(val);
		 System.out.println(m.printInt()); // can be printed directly
		 double d = 2.9773;
		 System.out.println(m.printDouble(d));
		 
		 
	}
}
