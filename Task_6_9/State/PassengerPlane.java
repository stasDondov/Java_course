package Task_6_9.State;
import Task_6_9.Airplane;

public class PassengerPlane extends Airplane {
	// Пасажирський літак
	
	public PassengerPlane(String name, int capacity, double liftingCapacity, double distanceFavor, double fuelConsumption) {
		super(name, capacity, liftingCapacity, distanceFavor, fuelConsumption);
		setType("Пасажирський");
	}
	
	public PassengerPlane(String name) {
		super(name);
		// дефолтні значення
		setCapacity(250);
		setLiftingCapacity(50);
		setDistanceFavor(10000);
		setFuelConsumption(5000);
		setType("Пасажирський");
	}
}

