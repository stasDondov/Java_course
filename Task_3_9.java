import java.util.Scanner;

/*
 * 3.9
 * Ввести в двох різних рядках послідовно два дійсних числа та
 * обчислити значення їх різниці та добутку. Результат вивести в
 * десятковому представленні (з фіксованою крапкою).
 * @author Дондов Станіслав
 */

public class Task_3_9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		float a = in.nextFloat();
		System.out.print("b = ");
		float b = in.nextFloat();
		System.out.printf("a - b = %.3f\n", a - b);
		System.out.printf("a * b = %.3f\n", a * b);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_9.java
// <= java Task_3_9

// => a = <= 0.3789
// => b = <= 1.54
// => a - b = -1.161
// => a * b = 0.584

