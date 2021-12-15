import java.util.Scanner;

/*
 * 1.1
 * Напишіть програму, яка підраховує число слів у тексті. Розгляньте
 * випадки, коли текст визначається в самій програмі і вводиться з ко-
 * мандного рядка при запуску програми на виконання.
 * @author Дондов Станіслав
 */

public class Task_1_1 {
	public static void countWords(String str) {
		String[] words = str.split(" ");
		System.out.printf("У тексті %d слів.\n", words.length);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = "";
		if (args[0].equals("0")) {
			System.out.println("Your text:");
			text = sc.nextLine();
		} else if (args[0].equals("1")) {
			text = "a b c d ef";
		}
		countWords(text);
		
		sc.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_1.java

// <= java Task_1_1 0
// => Your text:
// <= a b c
// => У тексті 3 слів.

// <= java Task_1_1 1
// => У тексті 5 слів.

