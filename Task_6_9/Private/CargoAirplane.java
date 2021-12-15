package Task_6_9.Private;
import Task_6_9.Airplane;

public class CargoAirplane extends Airplane {
	// Вантажний літак
	
	public CargoAirplane(String name, int capacity, double liftingCapacity, double distanceFavor, double fuelConsumption) {
		super(name, capacity, liftingCapacity, distanceFavor, fuelConsumption);
		setType("Вантажний");
	}
	
	public CargoAirplane(String name) {
		super(name);
		// дефолтні значення
		setCapacity(4);
		setLiftingCapacity(150);
		setDistanceFavor(5000);
		setFuelConsumption(3000);
		setType("Вантажний");
	}
}

