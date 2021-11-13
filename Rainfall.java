import java.util.Scanner;

/*
 * 1.13
 * Проблема опадів. Напишіть програму Rainfall.java, яка читатиме не-
 * від'ємні цілі числа (що представляють кількість опадів) по одному за
 * раз, доки не буде введено 999999, а потім роздрукує середнє значення
 * (не враховуючи 999999).
 * @author Дондов Станіслав
 */

public class Rainfall {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n; // наступне число
		double sum = 0; // сума введених чисел
		double i = 0; // номер введеного числа
		
		boolean flag = true;
		while (flag) {
			n = in.nextInt();
			if (n == 999999) {
				flag = false;
				continue;
			}
			sum += n;
			i++;
		}
		System.out.println("Mean: " + (sum / i));
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Rainfall.java
// <= java Rainfall

// => <= 1
// => <= 2
// => <= 6
// => <= 999999
// => Mean: 3.0

