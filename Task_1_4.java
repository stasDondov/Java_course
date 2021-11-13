import java.util.Scanner;

/*
 * 1.4
 * Напишіть програму, що вводить цілі числа та виводить число яке
 * зустрічається підряд найбільшу кількість разів та скільки саме разів
 * (якщо таких чисел декілька - то виводиться найбільше з таких чисел)
 * в заданому нижче форматі.
 * Приклад: 1 2 2 1 5 1 1 7 7 7 7 1 1
 * Результат: 4 підряд чисел 7.
 * @author Дондов Станіслав
 */

public class Task_1_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Your numbers: ");
		String s = in.nextLine();
		String[] str_arr = s.split(" ");
		int[] arr = new int[str_arr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str_arr[i]);
		}
		
		int max_len = 1;
		int len = 1;
		int n = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				if (max_len < len) {
					max_len = len;
					n = arr[i - 1];
				}
				len = 1;
			} else len++;
		}
		System.out.printf("Число %d зустрічається %d разів.\n", n, max_len);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_4.java
// <= java Task_1_4

// => Your numbers: <= 1 2 2 1 5 1 1 7 7 7 7 1 1
// => Число 7 зустрічається 4 разів.

