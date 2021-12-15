package Task_6_9.State;
import Task_6_9.Airplane;

public class MilitaryPlane extends Airplane {
	// Військовий літак
	
	public MilitaryPlane(String name, int capacity, double liftingCapacity, double distanceFavor, double fuelConsumption) {
		super(name, capacity, liftingCapacity, distanceFavor, fuelConsumption);
		setType("Військовий");
	}
	
	public MilitaryPlane(String name) {
		super(name);
		// дефолтні значення
		setCapacity(2);
		setLiftingCapacity(10);
		setDistanceFavor(5000);
		setFuelConsumption(1000);
		setType("Військовий");
	}
}

