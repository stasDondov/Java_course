import java.util.Scanner;

/*
 * 1.5
 * Напишіть програму, яка друкує 3 аргументи, взяті з командного 
 * рядка.
 * @author Дондов Станіслав
 */

public class Task_1_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println(args[i]);	
		}
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_5.java
// <= java Task_1_5 arg1 arg2 arg3

// => arg1
// => arg2
// => arg3

