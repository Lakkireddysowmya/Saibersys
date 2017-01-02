package Interface;

public class ImplementingInterface implements Interface1 {

	@Override
	public void car() {              // must implement the unimplemented methods 
		
		System.out.println("volvo");
	}

	@Override
	public void carColor() {
		
		System.out.println("Red");
	}
	public static void main(String[] args) {
		ImplementingInterface obj = new ImplementingInterface();
		System.out.print("Name of the car " );
		obj.car();
		System.out.print("Color ");
		obj.carColor();
		
		
	}

}
