import java.util.Scanner;

/*
 * 4.20a
 * Скласти програми наближеного обчислення суми всіх доданків,
 * абсолютна величина яких не менше eps > 0:
 * а) y = sin(x) = x - x^3/3! + x^5/5! - ...
 * @author Дондов Станіслав
 */

public class Task_4_20a {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("x = ");
		double x = in.nextDouble();
		double term = x, eps = 0.001, sum = 0, pow = x;
		int n = 1, fact = 1, k = 1;
		
		while (term * term > eps * eps) {
			sum += term;
			fact *= (n + 1) * (n + 2);
			pow *= x * x;
			k *= -1;
			n += 2;
			term = k * pow / fact;
		}
		System.out.println("sin(x) ≈ " + sum);
		System.out.println("Math.sin(x) = " + Math.sin(x)); // порівняємо значення
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_4_20a.java
// <= java Task_4_20a

// => x = <= 2
// => sin(x) ≈ 0.909347442680776
// => Math.sin(x) = 0.9092974268256817

