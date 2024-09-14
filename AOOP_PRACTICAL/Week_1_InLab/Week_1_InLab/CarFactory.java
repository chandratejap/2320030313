package Week_1_InLab;

public class CarFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicle() {
		// TODO Auto-generated method stub
		return new Car();
	}

}