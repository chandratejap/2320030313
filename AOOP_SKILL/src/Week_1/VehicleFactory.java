package Week_1;

public abstract class VehicleFactory {
	public abstract Vehicle createVehicle();

    public void driveVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
