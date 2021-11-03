import java.util.Scanner;

/*
 * 2.2
 * Використовуючи знаковий оператор зсуву вправо, змістіть його
 * вправо до кінця через усі його двійкові позиції, кожен раз
 * відображаючи результат за допомогою Integer.toBinaryString(). 
 * Почніть з числа, яке є двійковим. Зсуньте його вліво, а
 * потім використовуйте беззнаковий оператор зсуву вправо для
 * переміщення вправо через усі його двійкові позиції, кожен раз
 * відображаючи результат за допомогою Integer.toBinaryString().
 * @author Дондов Станіслав
 */

public class Task_2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		byte a = in.nextByte();
		System.out.println("Знаковий зсув вправо");
		byte a1 = a;
		while (a1 != 0) {
			System.out.println(Integer.toBinaryString(a1));
			a1 = (byte)(a1>>1);
		}
		System.out.println("Зсунемо вліво на 2 позиції");
		a1 = a;
		a1 = (byte)(a1<<2);
		System.out.println(Integer.toBinaryString(a1));
		
		System.out.println("Беззнаковий зсув вправо");
		while (a1 != 0) {
			System.out.println(Integer.toBinaryString(a1));
			a1 = (byte)(a1>>>1);
		}
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_2.java
// <= java Task_2_2

// => a = <= 5
// => Знаковий зсув вправо
// => 101
// => 10
// => 1
// => Зсунемо вліво на 2 позиції
// => 10100
// => Беззнаковий зсув вправо
// => 10100
// => 1010
// => 101
// => 10
// => 1

