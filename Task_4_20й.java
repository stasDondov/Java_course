import java.util.Scanner;

/*
 * 4.20й
 * Скласти програми наближеного обчислення суми всіх доданків,
 * абсолютна величина яких не менше eps > 0:
 * й) y = 1/(1+x^2) = 1 - x^2 + x^4 - x^6 + ..., (|x|<1);
 * @author Дондов Станіслав
 */
 
public class Task_4_20й {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("(|x| < 1), x = ");
		double x = in.nextDouble();
		double term = 1, eps = 0.001, sum = 0, pow = 1;
		int k = 1;
		
		while (term * term > eps * eps) {
			sum += term;
			pow *= x * x;
			k *= -1;
			term = k * pow;
		}
		System.out.println("1/(1+x^2) ≈ " + sum);
		System.out.println("1/(1+Math.pow(x, 2)) = " + (1.0 / (1 + Math.pow(x, 2)))); // порівняємо значення
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_4_20й.java
// <= java Task_4_20й

// => (|x| < 1), x = <= 0.55
// => 1/(1+x^2) ≈ 0.7671660515428712
// => 1/(1+Math.pow(x, 2)) = 0.7677543186180422

