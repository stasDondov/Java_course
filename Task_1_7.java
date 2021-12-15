import java.util.Scanner;

/*
 * 1.7
 * Напишіть програму, яка підраховує число символів, слів, знаків
 * пунктуації та речень у тексті. Розгляньте випадки, коли текст визначається
 * в самій програмі і вводиться з командного рядка при запуску
 * програми на виконання.
 * @author Дондов Станіслав
 */

public class Task_1_7 {
	public static void count(String text) {
		int num_punkt = 0;
		int num_words = 0;
		int num_sent = 0;
		
		String syms = "";
		for (int i = 0; i < text.length(); i++) {
			char s = text.charAt(i);
			if (!" ".equals(String.valueOf(s))) {
				if (".,!-?:".indexOf(s) != -1) {
					num_punkt++;
				}
				if (syms.indexOf(s) == -1) {
					syms = syms.concat(String.valueOf(s));
				}
				if (".".equals(String.valueOf(s))) {
					num_sent++;
				}
				if ("-".equals(String.valueOf(s))) {
					num_words--;
				}
			} else {
				num_words++;
			}
		}
		
		int num_sym = syms.length();
		if (num_words > 0) {
			num_words++;
		}
		System.out.printf("У тексті %d речень, %d слів, %d знаків пунктуації, %d різних символів.\n", num_sent, num_words, num_punkt, num_sym);
	}

	public static void main(String[] args) {
		String text = "";
		if (args[0].equals("0")) {
			text = "a b. c.";
		} else if (args[0].equals("1")) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Your text:");
			text = sc.nextLine();
			sc.close();
		}
		count(text);
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_7.java

// <= java Task_1_7 0
// => У тексті 2 речень, 3 слів, 2 знаків пунктуації, 4 різних символів.

// <= java Task_1_7 1
// => Your text:
// => a, b, c - sdvjn. g. sdvn: f. 
// => У тексті 3 речень, 7 слів, 7 знаків пунктуації, 14 різних символів.

