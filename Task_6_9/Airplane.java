package Task_6_9;

public abstract class Airplane {
	// Літак
	private int capacity; // пасажиромісткість
	private double liftingCapacity; // вантажопідйомність (в тонах)
	private double distanceFavor; // дальність польоту (в км)
	private double fuelConsumption; // споживання пального (в кг/год)
	private String type;
	private String name; 
	
	public Airplane(String name, int capacity, double liftingCapacity, double distanceFavor, double fuelConsumption) {
		this.name = name;
		this.capacity = capacity;
		this.liftingCapacity = liftingCapacity;
		this.distanceFavor = distanceFavor;
		this.fuelConsumption = fuelConsumption;
	}
	
	public Airplane(String name) {
		this.name = name;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int c) {
		capacity = c;
	}
	
	public double getLiftingCapacity() {
		return liftingCapacity;
	}
	
	public void setLiftingCapacity(double lc) {
		liftingCapacity = lc;
	}
	
	public double getDistanceFavor() {
		return distanceFavor;
	}
	
	public void setDistanceFavor(double df) {
		distanceFavor = df;
	}
	
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	
	public void setFuelConsumption(double fc) {
		fuelConsumption = fc;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	@Override
	public String toString() {
		return getType() + " " + getName() + " ";
	}
}

