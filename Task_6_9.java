import Task_6_9.Private.CargoAirplane;
import Task_6_9.Private.PrivateAirplane;
import Task_6_9.State.MilitaryPlane;
import Task_6_9.State.PassengerPlane;
import Task_6_9.Airline;

/*
 * 6.9
 * Авіакомпанія. Визначити ієрархію літаків. Створити авіакомпанію.
 * Порахувати загальну місткість і вантажопідйомність. Провести
 * сортування літаків компанії за дальністю польоту. Знайти літак в 
 * компанії, що відповідає заданому діапазону параметрів споживання
 * пального.
 * @author Дондов Станіслав
 */


public class Task_6_9 {
	public static void sortPlanes() {
		
	}
	
	public static void main(String[] args) {
		Airline A = new Airline("A");
		
		CargoAirplane c1 = new CargoAirplane("c1");
		A.addCargo(c1);
		CargoAirplane c2 = new CargoAirplane("c2", 4, 160, 4500, 3100);
		A.addCargo(c2);
		
		PassengerPlane pp1 = new PassengerPlane("pp1");
		A.addPassenger(pp1);
		PassengerPlane pp2 = new PassengerPlane("pp2", 300, 61, 6000, 5125);
		A.addPassenger(pp2);
		
		A.sortPlanesByDistance();
		A.showInfo();
		
		System.out.println(A.findGoodPlane(3000, 3200));
	}
}


//---------------(Terminal)---------------
// <= javac Task_6_9.java
// <= java Task_6_9 

// => Літаки компанії A:
// => - Вантажні
// =>	 	Вантажний c2 
// => 		Вантажний c1 
// => - Пасажирські
// => 		Пасажирський pp2 
// => 		Пасажирський pp1 
// => c2

