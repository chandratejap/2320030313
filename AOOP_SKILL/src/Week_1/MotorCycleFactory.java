package Week_1;

public class MotorCycleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new MotorCycle();
    }
}