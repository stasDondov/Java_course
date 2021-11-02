import java.util.Scanner;

/*
 * 3.3
 * Виведіть напис: "Введіть ім'я: "
 * Введіть з нового рядка ваше ім'я (наприклад, "Вася") та виведіть
 * привітання вигляду "Привіт, Вася!"
 * @author Дондов Станіслав
 */

public class Task_3_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введіть ім'я:");
		String name = in.nextLine();
		System.out.println("Привіт, " + name + "!");
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_3.java
// <= java Task_3_3

// => Введіть ім'я:
// <= Вася
// => Привіт, Вася!

