import java.util.Scanner;

/*
 * 1.3
 * Напишіть програму, яка в даному рядку замінить всі слова "small" 
 * на "very large".
 * @author Дондов Станіслав
 */

public class Task_1_3 {
	public static void replaceWords(String[] words) {
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("small")) {
				words[i] = "very large";
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
		replaceWords(text);
		printWords(text);
		sc.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_3.java
// <= java Task_1_3 

// => Your text:
// <= my salary is small
// => my salary is very large 

