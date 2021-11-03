/*
 * 2.1
 * Напишіть програму з двома постійними значеннями, одне з змінними
 * одиницями та нулями, з нулем у найменш значущій цифрі, а
 * друге, також поперемінним, з одиницею у найменш значущій цифрі
 * (підказка: Найпростіше використовувати шістнадцяткову систему
 * константи для цього). Візьміть ці 2 значення та об'єднайте їх
 * усіма можливими способами, використовуючи побітові оператори, і
 * виведіть результати за допомогою Integer.toBinaryString(). Почніть
 * з числа, яке має найбільшу значущу двійкову позицію (підказка:
 * Використовуйте шістнадцяткову константу).
 * @author Дондов Станіслав
 */

public class Task_2_1 {
	public static void main(String[] args) {
		final byte A = 0xa; // dec(A) = 10
		final byte B = 0x15; // dec(B) = 21
		System.out.println("A = " + Integer.toBinaryString(A));
		System.out.println("B = " + Integer.toBinaryString(B));
		System.out.println("A|B = " + Integer.toBinaryString(A|B));
		System.out.println("A^B = " + Integer.toBinaryString(A^B));
		System.out.println("A&B = " + Integer.toBinaryString(A&B));
		System.out.println("A>>>B = " + Integer.toBinaryString(A>>>B));
		System.out.println("B<<A = " + Integer.toBinaryString(A<<B));
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_1.java
// <= java Task_3_1

// => A = 1010
// => B = 10101
// => A|B = 11111
// => A^B = 11111
// => A&B = 0
// => A>>>B = 0
// => B<<A = 1010000000000000000000000

