import java.util.Scanner;

/*
 * 2.5
 * Ввести ціле число n (однобайтове число) і вивести число, отримане
 * в результаті циклічного зсуву числа n на один розряд вліво, тобто
 * старший біт посунутий в позицію молодшого, а всі інші біти
 * зсуваються на один розряд вліво. Наприклад, якщо введено 130,
 * відповіддю буде 5.
 * @author Дондов Станіслав
 */

public class Task_2_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		System.out.printf("%s = bin(%d)\n", Integer.toBinaryString(n), n);
		int ans = ((n<<1)^(n>>7&1))&0b01111111;
		System.out.printf("Answer: %s = bin(%d)\n", Integer.toBinaryString(ans), ans);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_5.java
// <= java Task_2_5

// => n = <= 130
// => 10000010 = bin(130)
// => Answer: 101 = bin(5)

