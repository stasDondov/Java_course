import Task_5_14.SimpleFraction;

/*
 * 5.14
 * Створити об'єкт класу ПростийДріб, використовуючи клас Число. Методи:
 * виведення на екран, додавання, віднімання, множення, ділення.
 * @author Дондов Станіслав
 */

public class Task_5_14 {
	public static void main(String[] args) {
		SimpleFraction a = new SimpleFraction();
		SimpleFraction b = new SimpleFraction();
		
		System.out.printf("%s + %s = ", a, b);
		a.add(b);
		System.out.println(a);
		
		System.out.printf("%s * %s = ", a, b);
		a.mul(b);
		System.out.println(a);
		
		System.out.printf("%s - %s = ", b, a);
		b.sub(a);
		System.out.println(b);
		
		System.out.printf("%s / %s = ", b, a);
		b.div(a);
		System.out.println(b);
	}
}


//---------------(Terminal)---------------
// <= javac Task_5_14.java
// <= java Task_5_14 

// => 8/7 + 7/2 = 65/14
// => 65/14 * 7/2 = 65/4
// => 7/2 - 65/4 = -51/4
// => -51/4 / 65/4 = -51/65

