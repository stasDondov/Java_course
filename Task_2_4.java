import java.util.Scanner;

/*
 * 2.4
 * Ввести цілі числа n і m, вивести ціле число, у якого m-й біт
 * відрізняється від m-го біта числа n, а всі інші біти збігаються з
 * бітами числа n на тих же позиціях. Наприклад, якщо введені 5 і 1,
 * відповіддю буде 7.
 * @author Дондов Станіслав
 */

public class Task_2_4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		System.out.print("m = ");
		int m = in.nextInt();
		int ans = n^(1<<m);
		System.out.printf("%s = bin(%d)\n", Integer.toBinaryString(n), n);
		System.out.printf("Answer: %s = bin(%d)\n", Integer.toBinaryString(ans), ans);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_4.java
// <= java Task_2_4

// => n = <= 5
// => m = <= 1
// => 101 = bin(5)
// Answer: 111 = bin(7)

