/*
 * 3.5
 * Напишіть програму, яка бере п'ять цілочисельних аргументів
 * командного рядка та друкує медіану (третю за величиною). Спробуйте
 * обчислити медіану 5 елементів так, щоб після виконання вона ніколи
 * не робила більше 6 загальних порівнянь.
 * @author Дондов Станіслав
 */
 
public class Task_3_5 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		for (int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}
		// скористаємось методом медіани медіан
		int left = 0;
		int right = 4;
		int i = left + 1;
		int swap;
		int j = 0;
		while (i <= right) {
			j = i;
			while (j > left) {
				if (arr[j - 1] <= arr[j]) break;
				swap = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = swap;
				j--;
			}
			i++;
		}
		System.out.println("Median: " + arr[2]);
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_5.java
// <= java Task_3_5 5 1 4 2 3

// => Median: 3

