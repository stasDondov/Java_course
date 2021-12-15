package Task_6_9;
import java.util.ArrayList;
import Task_6_9.Private.CargoAirplane;
import Task_6_9.Private.PrivateAirplane;
import Task_6_9.State.MilitaryPlane;
import Task_6_9.State.PassengerPlane;


public class Airline {
	// Авіакомпанія
	private String name;
	private ArrayList<CargoAirplane> ca = new ArrayList<CargoAirplane>();
	private ArrayList<PrivateAirplane> pa = new ArrayList<PrivateAirplane>();
	private ArrayList<MilitaryPlane> mp = new ArrayList<MilitaryPlane>();
	private ArrayList<PassengerPlane> pp = new ArrayList<PassengerPlane>();
	
	public Airline(String name) {
		this.name = name;
	};
	
	public ArrayList getCargo() {
		return ca;
	}
	
	public void addCargo(CargoAirplane c1) {
		ca.add(c1);
	}
	
	public void removeCargo(CargoAirplane c1) {
		ca.remove(c1);
	}
	
	public ArrayList getPrivate() {
		return pa;
	}
	
	public void addPrivate(PrivateAirplane pr1) {
		pa.add(pr1);
	}
	
	public void removePrivate(PrivateAirplane pr1) {
		pa.remove(pr1);
	}
	
	public ArrayList getMilitary() {
		return mp;
	}
	
	public void addMilitary(MilitaryPlane m1) {
		mp.add(m1);
	}
	
	public void removeMilitary(MilitaryPlane m1) {
		mp.remove(m1);
	}
	
	public ArrayList getPassenger() {
		return pp;
	}
	
	public void addPassenger(PassengerPlane pp1) {
		pp.add(pp1);
	}
	
	public void removePassenger(PassengerPlane pp1) {
		pp.remove(pp1);
	}
	
	private void swapCargo(int i1, int i2) {
		CargoAirplane tmp = ca.get(i1);
		ca.set(i1, ca.get(i2));
		ca.set(i2, tmp);
	}
	
	private void swapPrivate(int i1, int i2) {
		PrivateAirplane tmp = pa.get(i1);
		pa.set(i1, pa.get(i2));
		pa.set(i2, tmp);
	}
	
	private void swapMilitary(int i1, int i2) {
		MilitaryPlane tmp = mp.get(i1);
		mp.set(i1, mp.get(i2));
		mp.set(i2, tmp);
	}
	
	private void swapPassenger(int i1, int i2) {
		PassengerPlane tmp = pp.get(i1);
		pp.set(i1, pp.get(i2));
		pp.set(i2, tmp);
	}
	
	public void sortPlanesByDistance() {
		if (ca.size() > 0) {
			for (int i = 1; i < ca.size(); i++) {
				if (ca.get(i).getDistanceFavor() < ca.get(i - 1).getDistanceFavor()) {
					swapCargo(i, i - 1);
				}
			}
		}
		if (pa.size() > 0) {
			for (int i = 1; i < pa.size(); i++) {
				if (pa.get(i).getDistanceFavor() < pa.get(i - 1).getDistanceFavor()) {
					swapPrivate(i, i - 1);
				}
			}
		}
		if (mp.size() > 0) {
			for (int i = 1; i < mp.size(); i++) {
				if (mp.get(i).getDistanceFavor() < mp.get(i - 1).getDistanceFavor()) {
					swapMilitary(i, i - 1);
				}
			}
		}
		if (pp.size() > 0) {
			for (int i = 1; i < pp.size(); i++) {
				if (pp.get(i).getDistanceFavor() < pp.get(i - 1).getDistanceFavor()) {
					swapPassenger(i, i - 1);
				}
			}
		}
	}
	
	public String findGoodPlane(int a, int b) {
		if (ca.size() > 0) {
			for (CargoAirplane c : ca)
				if (a <= c.getFuelConsumption() && c.getFuelConsumption() <= b)
					return c.getName();
		}
		if (pa.size() > 0) {
			for (PrivateAirplane pr : pa)
				if (a <= pr.getFuelConsumption() && pr.getFuelConsumption() <= b)
					return pr.getName();
		}
		if (mp.size() > 0) {
			for (MilitaryPlane m : mp)
				if (a <= m.getFuelConsumption() && m.getFuelConsumption() <= b)
					return m.getName();
		}
		if (pp.size() > 0) {
			for (PassengerPlane p : pp)
				if (a <= p.getFuelConsumption() && p.getFuelConsumption() <= b)
					return p.getName();
		}
		return "Жоден літак не підходить";
	}
	
	public void showInfo() {
		System.out.printf("Літаки компанії %s:\n", name);
		if (ca.size() > 0) {
			System.out.println("- Вантажні");
			for (CargoAirplane c : ca)
				System.out.println("\t" + c);
		}
		if (pa.size() > 0) {
			System.out.println("- Приватні");
			for (PrivateAirplane pr : pa)
				System.out.println("\t" + pr);
		}
		if (mp.size() > 0) {
			System.out.println("- Військові");
			for (MilitaryPlane m : mp)
				System.out.println("\t" + m);
		}
		if (pp.size() > 0) {
			System.out.println("- Пасажирські");
			for (PassengerPlane p : pp)
				System.out.println("\t" + p);
		}
	}
}

