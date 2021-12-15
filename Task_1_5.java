import java.util.Scanner;

/*
 * 1.5
 * Напишіть програму, яка перед кожним словом "small" та "large"
 * додасть слово "very".
 * @author Дондов Станіслав
 */

public class Task_1_5 {
	public static void addVery(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("small") || words[i].equals("large")) {
				words[i] = "very " + words[i];
			}
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
		addVery(text);
		printWords(text);
		sc.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_5.java
// <= java Task_1_5 

// => Your text:
// <= my salary is small
// => my salary is very small 

