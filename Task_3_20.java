import java.util.Scanner;

/*
 * 3.20
 * Обчислити гіпотенузу c прямокутного трикутника за катетами a та b. 
 * @author Дондов Станіслав
 */

public class Task_3_20 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		double a = in.nextDouble();
		System.out.print("b = ");
		double b = in.nextDouble();
		double c = Math.sqrt(a * a + b * b);
		System.out.println("c = " + c);
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_20.java
// <= java Task_3_20

// => a = <= 12
// => b = <= 5
// => c = 13.0

