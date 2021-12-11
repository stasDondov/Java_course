package Task_6_1.Flowers;
import Task_6_1.Flower;

public class Daisy extends Flower {
	private String name = "daisy";

	public Daisy() {
		super();
	}
	
	public Daisy(double price, double length, int freshness) {
		super(price, length, freshness);
	}
	
	@Override
	public String toString() {
		return name + " " + getPrice() + "$ " + getLength() + "sm " + getFreshness();
	}
}
