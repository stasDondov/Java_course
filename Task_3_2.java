/*
 * 3.2
 * Напишіть програму, яка генерує 25 випадкових значень int. Для
 * кожного значення використовуйте оператор if-else, щоб класифікувати
 * його як більше, менше або те що дорівнює другому випадково
 * згенерованому значенню.
 * @author Дондов Станіслав
 */
 
public class Task_3_2 {
	public static int generate_random() {
		return (int)(Math.random() * 123);
	}
	public static void main(String[] args) {
		int k = generate_random();
		for (int i = 0; i < 25; i++) {
			int m = generate_random();
			if (m < k) 
				System.out.println(m + " менше за " + k);
			else if (m == k) 
				System.out.println(m + " дорівнює " + k);
			else 
				System.out.println(m + " більше за " + k);
		}
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_2.java
// <= java Task_3_2

// => 29 менше за 89  # приклад виконання
// ...
// => 91 більше за 89
// => 7 менше за 89

