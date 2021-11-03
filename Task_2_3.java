/*
 * 2.3
 * Напишіть метод, який відображає значення char у двійковому вигляді.
 * Продемонструйте це, використовуючи кілька різних символів.
 * @author Дондов Станіслав
 */

public class Task_2_3 {
	public static String char_to_bin(char a) {
		return Integer.toBinaryString(a);
	}
	public static void main(String[] args) {
		char[] chars = {'a', 'b', 'c'};
		for (char sym : chars) {
			System.out.printf("bin(%c) = %s\n", sym, char_to_bin(sym));
		}
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_3.java
// <= java Task_2_3

// => bin(a) = 1100001
// => bin(b) = 1100010
// => bin(c) = 1100011

