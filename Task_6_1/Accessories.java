package Task_6_1;

public class Accessories {
	private double price;
	private String name = "decor";

	public Accessories(){}
	
	public Accessories(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return name + " " + price + "$";
	}
}

