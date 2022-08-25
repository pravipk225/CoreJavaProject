package interfaceex;

import java.io.IOException;

public class VehicleMain implements myInterface{
	public static void main(String[] args) {
		Car car=new Car();
		car.checkMotor();
		car.drive();
		car.turnLeft();
		car.brake();
		System.out.println("-------------------------");
		Train train=new Train();
		train.drive();
		train.turnLeft();
		train.brake();
		train.getNumberOfPeople();
	}

	@Override
	public String readFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printValues()  {
		// TODO Auto-generated method stub
		return null;
	}

}
