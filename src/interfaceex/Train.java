package interfaceex;

public class Train implements IVehicle,IPublicTransport {
	@Override
	public void getNumberOfPeople() {	
		System.out.println("Total Number of People in train: 15000");
	}
	@Override
	public void drive() {
		System.out.println("Train in drive mode.");
	}
	@Override
	public void turnLeft() {
		System.out.println("Train turn Left.");	
	}
	@Override
	public void brake() {
		System.out.println("Train brake mode.");	
	}

}
