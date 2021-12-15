import java.util.Scanner;

/*
 * 1.2
 * Напишіть програму, що записує текст у зворотньому порядку. Розгляньте
 * випадки, коли текст визначається в самій програмі і вводиться з командного 
 * рядка при запуску програми на виконання.
 * @author Дондов Станіслав
 */

public class Task_1_2 {
	public static void reverseText(String[] words) {
		for (int i = 0; i < (int)(words.length / 2); i++) {
			String tmp = words[i];
			words[i] = words[words.length - i - 1];
			words[words.length - i - 1] = tmp;
		}
	}
	
	public static void printWords(String[] words) {
		for (String word : words) {
			System.out.print(word + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your text:");
		String[] text = sc.nextLine().split(" ");
		reverseText(text);
		printWords(text);
		sc.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_2.java
// <= java Task_1_2 

// => Your text:
// <= a b c
// => c b a 

