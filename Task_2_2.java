import java.util.Scanner;

/*
 * 2.2
 * Введіть два цілих числа та виведіть кількість їх розрядів (розв'яжіть
 * це за допомогою рядків та використовуючи логарифм). Обчисліть се-
 * реднє гармонічне цих чисел та виведіть його з точністю до двох знаків
 * після коми.
 * @author Дондов Станіслав
 */

public class Task_2_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("a = ");
		int a = in.nextInt();
		System.out.print("b = ");
		int b = in.nextInt();
		
		System.out.printf("Число %d має %d розряди.\n", a, Math.round(Math.ceil(Math.log10(a + 1))));
		System.out.printf("Число %d має %d розряди.\n", b, Math.round(Math.ceil(Math.log10(b + 1))));
		
		float h = 2 / ((float) 1 / a + (float) 1 / b);
		System.out.printf("Середнє гармонічне: %.2f\n", h);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_1.java
// <= java Task_1_1

// => a = <= 23
// => b = <= 786
// => Число 23 має 2 розряди.
// => Число 786 має 3 розряди.
// => Середнє гармонічне: 44.69

