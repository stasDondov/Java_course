package Task_6_1;

public class Flower {
	private double price;
    private double length;
	private int freshness; // нехай оцінка свіжості = 1/2/3 - кількість днів, скільки квітка знаходиться в магазині, після 3 дня її викилають
	//private String name;

    public Flower(){
        super();
    }

    public Flower(double price, double length, int freshness) {
        this.price = price;
        this.length = length;
        this.freshness = freshness;
    }

    public double getLength() {
        return length;
    }
    
    public int getFreshness() {
    	return freshness;
    }
    
    public double getPrice() {
    	return price;
    }

}

