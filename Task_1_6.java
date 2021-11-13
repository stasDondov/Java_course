import java.util.Scanner;
import java.util.Arrays;

/*
 * 1.6
 * Знайти серед масиву чисел таке число, в якому кількість цифр міні-
 * мальна. Якщо їх декілька, виведіть всі з них.
 * @author Дондов Станіслав
 */
 
public class Task_1_6 {
	/** Довжина найкоротшого числа */
	static int minLength = Integer.MAX_VALUE;
	/** Довжина масиву для зберігання найкоротших чисел */
	static int N = 10;
	/** Масив чисел найкоротшої довжини */
	static String[] minNums = new String[N];
	/** Вказівник на першу вільну комірку масиву minNums */
	static int ptr = 0;
	
	/** Функція додає в масив minNums число x */
	static void addNum(String x) {
		if (!Arrays.asList(minNums).contains(x)) {
			minNums[ptr] = x;
			ptr++;	
		}
	}
	
	/** Функція очищує масив minNums */
	static void clearNums() {
		for (int i = 0; i < N; i++)
			minNums[i] = "";
		ptr = 0;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x_len;
		String x;
		String str;
		String[] arr;
		
		boolean flag = true;
		while (flag) {
			str = in.nextLine();
			if (str.length() == 0) { // для виходу з циклу останній рядок залиште пустим,  натисніть Enter
				flag = false;
				continue;
			}
			arr = str.split(" ");
			for (int i = 0; i < arr.length; i++) {
				x = arr[i];
				if (!"".equals(x)) {
					x_len = x.length();
					if (x_len <= minLength) {
						if (x_len < minLength) {
							clearNums();
							minLength = x_len;
						}
						addNum(x);
					}
				}
			}
		}
		System.out.printf("Числа найкоротшої довжини(%d):\n", minLength);
		System.out.println(String.join(" ", minNums));
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_6.java
// <= java Task_1_6

// => <= 1 45 0 215
// => <= -39         54621 1 8  1       
// =>
// => Числа найкоротшої довжини(1):
// => 1 0 8  

