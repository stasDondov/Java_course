import java.util.Scanner;

/*
 * 2.12
 * Ввести натуральне число M. Встановіть її біт з номером j рівним
 * нулеві та виведіть отримане число виведіть в
 * десятковому та шістнадцятковому вигляді.
 * @author Дондов Станіслав
 */

public class Task_2_12 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("M = ");
		int M = in.nextInt();
		System.out.printf("bin(%d) = %s\n", M, Integer.toBinaryString(M));
		System.out.print("j = ");
		int j = in.nextInt();
		M = M & (0b11111111 ^ (1 << j));
		System.out.printf("M -> %d\nbin(M) = %s\nhex(M) = %s\n", M,  Integer.toBinaryString(M), Integer.toHexString(M));
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_12.java
// <= java Task_2_12

// => M = <= 247
// => bin(247) = 11110111
// => j = <= 4
// => M -> 231
// => bin(M) = 11100111
// => hex(M) = e7

