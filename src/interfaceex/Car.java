package interfaceex;

public class Car extends MotorisedVehicle implements IVehicle{
	@Override
	public void drive() {
		System.out.println("Car in drive mode.");
	}
	@Override
	public void turnLeft() {
		System.out.println("Car turn Left.");	
	}
	@Override
	public void brake() {
		System.out.println("Car in brake mode.");	
	}
}
