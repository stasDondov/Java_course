import java.util.Scanner;

/*
 * 7
 * Задане натуральне число n. Надрукувати в заданій системі числення
 * b цілі числа від 0 до n.
 * @author Дондов Станіслав
 */

public class Task_7 {
	public static String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public static String toOtherSystem(int k, int b) {
		String num = "";
		int r = 0;
		
		if (k == 0) {
			return "0";
		} else {
			while (k != 0) {
				r = k % b;
				if (r > 9) {
					num = String.valueOf(alp.charAt(r%10)).concat(num);
				} else {
					num = Integer.toString(r).concat(num);
				}
				k = k/b;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n = ");
		int n = sc.nextInt();
		
		System.out.print("b = ");
		int b = sc.nextInt();
		
		for (int i = 0; i <= n; i++) {
			System.out.println(toOtherSystem(i, b));
		}
		sc.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_7.java
// <= java Task_7

// => n = <= 5 
// => b = <= 3
// => 0
// => 1
// => 2
// => 10
// => 11
// => 12

