import java.util.Scanner;

/*
 * 2.1
 * Вивести в консоль підказку "Введіть прізвище", введіть його з консолі
 * та виведіть повідомлення "Привіт, ***" де замість зірочок - введене 
 * прізвище.
 * @author Дондов Станіслав
 */

public class Task_2_1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Введiть прiзвище: ");
		String surname = in.nextLine();
		System.out.println("Привiт, " + surname);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_1.java
// <= java Task_1_1

// => Введіть прізвище: <= Dondov
// => Привіт, Dondov

