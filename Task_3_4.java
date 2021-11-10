/*
 * 3.4
 * Напишіть програму, яка бере три цілі аргументи командного рядка a,
 * b і c і надрукуйте кількість різних значень (1, 2 або 3) серед a, b і c.
 * @author Дондов Станіслав
 */
 
public class Task_3_4 {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		if (a == b && b == c)
			System.out.printf(1);
		else if (a != b && b != c && a != c)
			System.out.println(3);
		else
			System.out.println(2); 
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_4.java
// <= java Task_3_4 1 2 2

// => 2

