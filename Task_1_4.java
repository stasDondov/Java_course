import java.util.Scanner;

/*
 * 1.4
 * Напишіть програму, яка в даному рядку видалить всі артиклі "a" та "an".
 * @author Дондов Станіслав
 */

public class Task_1_4 {
	public static void removeArticles(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("a") || words[i].equals("an")) {
				words[i] = "";
			}
		}
	}
	
	public static void printWords(String[] words) {
		for (String word : words) {
			if (!word.equals(""))
				System.out.print(word + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Your text:");
		String[] text = sc.nextLine().split(" ");
		removeArticles(text);
		printWords(text);
		sc.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_4.java
// <= java Task_1_4 

// => Your text:
// <= a b c an m
// => b c m 

