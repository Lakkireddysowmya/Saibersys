package pakage1;

public class ReturnAndParameter {

	String printString(String val)
	{
		return "hello"+val;
	}
	public static void main(String[] args) {
		ReturnAndParameter obj = new ReturnAndParameter();
		String val="Abhishek";
		System.out.println(obj.printString(val));
	}
}
