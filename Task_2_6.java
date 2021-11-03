import java.util.Scanner;

/*
 * 2.6
 * Визначити, скільки разів зустрічається 11 в двійковому поданні
 * цілого додатнього числа (так, в двійковому поданні 11110111 воно
 * зустрічається 5 разів).
 * @author Дондов Станіслав
 */

public class Task_2_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int a = in.nextInt();
		System.out.printf("bin(%d) = %s\n", a, Integer.toBinaryString(a));
		int cnt = 0;
		int n = Integer.toBinaryString(a).length();
		while (n > 1) {
			if ((a&0b11) == 0b11) cnt++;
			a = a>>1;
			n = Integer.toBinaryString(a).length();
		}
		System.out.printf("11 зустрічається %d разів.\n", cnt);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_6.java
// <= java Task_2_6

// => n = <= 247
// => bin(247) = 11110111
// => 11 зустрічається 5 разів.

