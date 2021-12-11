package Task_6_1.Flowers;
import Task_6_1.Flower;

public class Tulip extends Flower {
	private String name = "tulip";

	public Tulip() {
		super();
	}
	
	public Tulip(double price, double length, int freshness) {
		super(price, length, freshness);
	}
	
	@Override
	public String toString() {
		return name + " " + getPrice() + "$ " + getLength() + "sm " + getFreshness();
	}
}
