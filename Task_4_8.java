/*
 * 4.8
 * Визначити клас ТочкаВПросторі, координати якої задаються з допомогою
 * КомплексногоЧисла. Створити методи по визначенню відстані
 * між точками і до початку координат.
 * @author Дондов Станіслав
 */

public class Task_4_8 {
	public static void main(String[] args) {
		PointInSpace t1 = new PointInSpace(new ComplexNumber(1, 2));
		PointInSpace t2 = new PointInSpace(new ComplexNumber(-4, 3));
		
		System.out.println("t1: " + t1);
		System.out.println("distance to 0: " + t1.distanceToO());
		System.out.println("t2: " + t2);
		System.out.println("distance to 0: " + t2.distanceToO());
		System.out.println("distance between points: " + t1.distance(t2));
	}
}


//---------------(Terminal)---------------
// <= javac Task_4_8.java
// <= java Task_4_8 

// => t1: (1, 2)
// => distance to 0: 2.23606797749979
// => t2: (-4, 3)
// => distance to 0: 5.0
// => distance between points: 5.0990195135927845

