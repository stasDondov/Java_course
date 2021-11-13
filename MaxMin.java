import java.util.Scanner;

/*
 * 1.2
 * Напишіть програму MaxMin.java що дозволяє користувачу ввести
 * скільки завгодно цілих чисел через пробіл доки той не натисне enter
 * та виводить найбільше та найменше значення серед цих чисел.
 * @author Дондов Станіслав
 */

public class MaxMin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Your numbers: ");
		String s = in.nextLine();
		String[] arr = s.split(" ");
		int max = Integer.parseInt(arr[0]);
		int min = Integer.parseInt(arr[0]);
		for (String a : arr) {
			int an = Integer.parseInt(a);
			if (an > max) max = an;
			if (an < min) min = an;
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac MaxMin.java
// <= java MaxMin

// => Your numbers: <= 1 21 -9 0 65
// => max = 65
// => min = -9

