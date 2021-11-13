import java.util.Scanner;

/*
 * 1.25
 * <200b><200b>Коди UPC. Універсальний код продукту (UPC) - це 12-
 * значний код, який однозначно визначає продукт. Найменш значуща
 * цифра d1 (крайня права) - це контрольна цифра, яка визначається
 * однозначно, зробивши такий вираз кратним 10: (d1 + d3 + d5 + d7 + d9 +
 * d11) + 3(d2 + d4 + d6 + d8 + d10 + d12). Наприклад, контрольна цифра,
 * що відповідає 0-48500-00102 (Tropicana Pure Premium Arange Juice),
 * дорівнює 8, оскільки (8 + 0 + 0 + 0 + 5 + 4) + 3(2 + 1 + 0 + 0 + 8 +
 * 0) = 50 і 50 кратно 10. Напишіть програму, яка зчитує 11-значне ціле
 * число з параметра командного рядка, обчислює контрольну цифру та
 * друкує повний UPC. Підказка: використовуйте змінну типу long для
 * збереження 11-значного числа.
 * @author Дондов Станіслав
 */

public class Task_1_25 {
	static String toUPC(long n) {
		long[] arr = new long[12];
		
		for (int i = 0; i < 11; i++) {
			arr[10 - i] = n % 10;
			n = n / 10;
		}
		
		int sum1 = 0, sum2 = 0, sum = 0;
		
		for (int i = 11; i > 0; i -= 2) {
			sum1 += arr[i];
		}
		for (int i = 10; i > 0; i -= 2) {
			sum2 += arr[i];
		}
		sum = sum1 + 3 * sum2;
		arr[11] = (sum / 10 + 1) * 10 - sum;
		
		String[] arr_ans = new String[12];
		for (int i = 0; i < arr.length; i++) {
			arr_ans[i] = Long.toString(arr[i]);
		}
		
		return String.join("", arr_ans);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = Long.parseLong(args[0]);
		String ans = toUPC(n);
		System.out.println(ans.substring(0, 1) + "-" + ans.substring(1, 6) + "-" + ans.substring(6, 11) + "-" + ans.substring(11, 12));
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_25.java
// <= java Task_1_25 04850000102

// => 0-48500-00102-8

