package package2;

public class TryCatch {

	public static void main(String[] args) {
		int a= 10;
		int b = 0,c;
		try{		// try
			c= a/b;
			System.out.println(c);
		}
		catch(Exception e){ // catching when it fails 
			System.out.println("RunTime error divide by zero");
		}
		finally {
			System.out.println("finally block");
		}
	}
}
