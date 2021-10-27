/*
 * 1.6
 * Знайти суму аргументів командного рядка та порахувати введені дій-
 * сні числа.
 * @author Дондов Станіслав
 */

public class Task_1_6 {
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += Double.valueOf(args[i]);
		}
		System.out.println("sum = " + sum);
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_6.java
// <= java Task_1_6 0.56 1 61.23

// => sum = 62.79

