package Task_6_9.Private;
import Task_6_9.Airplane;

public class PrivateAirplane extends Airplane {
	// Приватний літак
	
	public PrivateAirplane(String name, int capacity, double liftingCapacity, double distanceFavor, double fuelConsumption) {
		super(name, capacity, liftingCapacity, distanceFavor, fuelConsumption);
		setType("Приватний");
	}
	
	public PrivateAirplane(String name) {
		super(name);
		// дефолтні значення
		setCapacity(10);
		setLiftingCapacity(20);
		setDistanceFavor(3000);
		setFuelConsumption(800);
		setType("Приватний");
	}
}

