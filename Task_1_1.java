/*
 * 1.1
 * Створіть масив об'єктів String і призначте String кожному елементу.
 * Роздрукуйте масив за допомогою циклу for.
 * @author Дондов Станіслав
 */

public class Task_1_1 {
	public static void main(String[] args) {
		String[] arr = {"abc", "def", "123"};
		for (String s : arr) {
			System.out.println(s);
		}
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_1.java
// <= java Task_1_1

// => abc
// => def
// => 123

