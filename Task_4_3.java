/*
 * 4.3
 * Напишіть функцію Rosenbrock2d(x, y) = 100(x^2 - y)^2 + (x - 1)^2 та
 * перевірте її результат на довільних трьох парах дійсних чисел.
 * @author Дондов Станіслав
 */

public class Task_4_3 {
	public static double Rosenbrock2d(double x, double y) {
		return 100 * Math.pow(Math.pow(x, 2) - y, 2) + Math.pow(x - 1, 2);
	}
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			double a1 = Math.random() * 10;
			double a2 = Math.random() * 10;
			System.out.printf("Rosenbrock2d(%.3f, %.3f) = %.3f\n", a1, a2, Rosenbrock2d(a1, a2));
		}
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_1.java
// <= java Task_3_1

// => Rosenbrock2d(a1, a2) = res1   # a1, a2 = random arguments
// => Rosenbrock2d(a1, a2) = res2
// => Rosenbrock2d(a1, a2) = res3

