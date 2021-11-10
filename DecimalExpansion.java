import java.util.Scanner;

/*
 * 4.1
 * Десяткове розкладання раціональних чисел. Враховуючи два
 * цілих числа p і q, десяткове розширення p/q має нескінченно
 * повторюваний цикл. Наприклад, 1/33 = 0.03030303... Ми
 * використовуємо позначення 0.(03) для позначення того, що 03
 * повторюється нескінченно довго. Як інший приклад, 8639/70000 = 0.1234(142857).
 * Напишіть програму DecimalExpansion.java, яка
 * зчитує два цілих числа командного рядка p і q і друкує десяткове
 * розширення p/q, використовуючи зазначені вище позначення.
 * Підказка: використовуйте правило Флойда.
 * @author Дондов Станіслав
 */
 
public class DecimalExpansion {
	/** Записуємо покроково цифри десяткового представлення раціонального числа в масив arr */
	static String[] arr = new String[20]; 
	/** "Вказівник" на першу вільну комірку масиву arr */
	static int ptr = 0;

	/*
	 * Функція пошуку деякого залишку з циклічної частини правильного дробу p/q
	 */
	public static int remainderInLoop(int p, int q) {
		// залишки співпадуть коли обидва потраплять в цикл і відстань між ними стане кратною довжині циклу
		int r1 = p;
		int r2 = p;
		do { // за алгоритмом Флойда
			r1 = 10 * r1 % q;
			r2 = 10 * (10 * r2 % q) % q;
		} while (r1 != r2);
		return r1;
	}

	/*
	 * Функція повертає довжину циклічної частини правильного дробу p/q
	 */ 
	public static int loopLength(int p, int q) {
		int r1 = remainderInLoop(p, q); // деякий залишок з циклічної частини
		// йдемо далі, рахуємо кроки до моменту коли залишок повториться
		int r2 = r1;
		for (int i = 1; ; i++) {
		    r2 = 10 * r2 % q;
		    if (r2 == r1) return i;
		}
	}
	
	/*
	 * Функція знаходить початок циклічної частини правильного дробу p/q
	 * @param ll - довжина циклу
	 */
	public static int loopStart(int p, int q, int ll) {
		int r1 = p;
		int r2 = p;
		for (int i = 0; i < ll; ++i) { // відступаємо на довжину циклу
		    r2 = 10 * r2 % q;
		}
		// синхронно зсуваємо залишки, рахуємо кроки до моменту коли вони співпадуть
		int i = 0;
		while (r1 != r2) {
			r1 = 10 * r1 % q;
		    r2 = 10 * r2 % q;
		    i++;
		}
		return i;
	}
	
	/*
	 * Записує n цифр правильного дробу p/q в масив arr
	 * повертає залишок для продовження запису дробу
	 */
	public static int recordDigits(int p, int q, int n) {
		
		int r = p;
		for (int i = 0; i < n; ++i) {
		    arr[ptr] = Integer.toString(10 * r / q);
		    ptr++;
		    r = 10 * r % q;
		}
		return r;
	}
	
	/*
	 * Функція записує дріб p/q в arr
	 */
	public static void recordDecimal(int p, int q) {
		arr[ptr] = Integer.toString(p / q); // записуємо цілу частину дробу
		ptr++;

		int r = p % q;
		// записуємо в arr дробову частину
		if (r != 0) {
		    arr[ptr] = "."; 
		    ptr++;

		    int ll = loopLength(r, q);
		    int ls = loopStart(r, q, ll);
		    // записуємо цифри дробової частини до початку циклу
		    r = recordDigits(r, q, ls);
		    // друкуємо цифри цикла в дужках
		    if (r != 0) {
		        arr[ptr] = "(";
				ptr++;
		        recordDigits(r, q, ll);
		        arr[ptr] = ")";
				ptr++;
		    }
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("p = ");
		int p = in.nextInt();
		System.out.print("q = ");
		int q = in.nextInt();

		recordDecimal(p, q);
		String ans = String.join("", arr).substring(0, ptr);
		System.out.printf("%d / %d = %s\n", p, q, ans);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac DecimalExpansion.java
// <= java DecimalExpansion

// => p = <= 1
// => q = <= 33
// => 1 / 33 = 0.(03)

