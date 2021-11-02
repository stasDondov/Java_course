import java.util.Scanner;

/*
 * 4.2a
 * Скласти функцію для обчислення значення многочлена від двох
 * змінних для введеної з клавіатури пари чисел (x, y):
 * a) f(x, y) = x^3 + 3*x^2*y + 3*x*y^2 + y^3;
 * @author Дондов Станіслав
 */

public class Task_4_2a {
	public static double f(double x, double y) {
		return Math.pow(x, 3) + 3 * Math.pow(x, 2) * y + 3 * x * Math.pow(y, 2) + Math.pow(y, 3);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x = ");
		double x = in.nextDouble();
		System.out.print("y = ");
		double y = in.nextDouble();
		System.out.println("f(x, y) = " + f(x, y));
	}
}


//---------------(Terminal)---------------
// <= javac Task_4_2a.java
// <= java Task_4_2a

// => x = <= 1
// => y = <= 3
// => f(x, y) = 64.0

