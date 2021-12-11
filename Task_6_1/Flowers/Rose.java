package Task_6_1.Flowers;
import Task_6_1.Flower;

public class Rose extends Flower {
	private String name = "rose";

	public Rose() {
		super();
	}
	
	public Rose(double price, double length, int freshness) {
		super(price, length, freshness);
	}
	
	@Override
	public String toString() {
		return name + " " + getPrice() + "$ " + getLength() + "sm " + getFreshness();
	}
}
