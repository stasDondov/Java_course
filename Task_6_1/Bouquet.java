package Task_6_1;

public class Bouquet {
	//private double price;
	private Flower[] flws;
	private Accessories[] ac;

	public Bouquet(Flower[] flws, Accessories[] ac) {
		this.flws = flws;
		this.ac = ac;
	}
	
	private void swap(int i1, int i2) {
		Flower tmp = flws[i1];
		flws[i1] = flws[i2];
		flws[i2] = tmp;
	}
	
	public void sortFlowers() {
		for (int i = 1; i < flws.length; i++) {
			if (flws[i].getFreshness() < flws[i - 1].getFreshness()) {
				swap(i, i - 1);
			}
		}
	}
	
	public Flower goodLength(double a, double b) {
		//Flower ans = new Flower();
		for (Flower f : flws) {
			if (f.getLength() >= a && f.getLength() <= b)
				return f;
				//ans = f;
		}
		System.out.println("жодна квітка не підходить:(");
		return new Flower();
	}
	
	public double getPrice(){
		double sum = 0;
		for (Flower f : flws)
			sum += f.getPrice();
		for (Accessories a : ac)
			sum += a.getPrice();
		return sum;
	}
	
	@Override
	public String toString() {
		String str = "Bouquet consists of \n";
		for (Flower f : flws)
			str += f + "\n";
		for (Accessories a : ac)
			str += a;
		return str;
	}

}



