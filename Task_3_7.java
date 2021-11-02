import java.util.Scanner;

/*
 * 3.7
 * Обчислити силу притягання  F в науковому (експоненційному)
 * форматі між двома тілами, що мають маси m1, m2 на відстані r.
 * Вказівка. Шукана сила визначається за формулою F = y * (m1*m2) / r^2, де
 * y = 6.673*10^(-11) Н*м^2/кг^2. Всі потрібні змінні присвоюються всередині
 * програми. Результат вивести в окремому рядку вигляду "F=***", де
 * замість зірок представлення в науковому (експоненційному) вигляді.
 * @author Дондов Станіслав
 */

public class Task_3_7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("m1 = ");
		double m1 = in.nextDouble();
		System.out.print("m2 = ");
		double m2 = in.nextDouble();
		System.out.print("r = ");
		double r = in.nextDouble();
		double y = 0.673E-12;
		double F = y * (m1 * m2) / Math.pow(r, 2);
		System.out.printf("F = %E H\n", F);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_7.java
// <= java Task_3_7

// => m1 = <= 60
// => m2 = <= 115
// => r = <= 90
// => F = 5.732963E-13 H

