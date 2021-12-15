import java.util.Scanner;

/*
 * 1.8
 * Напишіть програму, яка перевіряє, чи певне слово міститься в даному
 * тексті. Розгляньте випадки, коли текст визначається в самій програмі
 * і вводиться з командного рядка при запуску програми на виконання.
 * Програма повинна розпізнавати слово незалежно від регістру, в якому
 * воно записане. Розгляньте випадки залежно/незалежно від регістру.
 * @author Дондов Станіслав
 */

public class Task_1_8 {
	public static String text;
	
	public static String[] textToArr() {
		// text = 
		text.replace(",", "").replace(".", "");
		return text.split(" ");
	}
	
	public static boolean checkWord(String word, String flag) {
		String[] arr = textToArr();
		if ("0".equals(flag)) { // залежно від регістру
			for (String w : arr) {
				if (word.equals(w)) {
					return true;
				}
			}
		} else if ("1".equals(flag)) { // незалежно від регістру
			for (String w : arr) {
				if (word.toLowerCase().equals(w.toLowerCase())) {
					return true;
				}
			}
		} 
		return false;
	}

	public static void main(String[] args) {
		text = "a ab vd knnm s c. sd, d, h.";
		//String[] words = textToArr(text);
		Scanner sc = new Scanner(System.in);
		System.out.print("Your word: ");
		String word = sc.nextLine();
		System.out.println(checkWord(word, args[0]));
		sc.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_8.java

// <= java Task_1_8 0
// => Your word: <= A
// => false

// <= java Task_1_8 1
// => Your word: <= A
// => true

