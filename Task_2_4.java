import java.util.Scanner;
import java.util.Random;

/*
 * 2.4
 * Знайти суму елементів матриці, розташованих між першим і другим
 * додатними елементами кожного рядка.
 * @author Дондов Станіслав
 */

public class Task_2_4 {

	static int[][] generateRandomMatrix(int n, int m) {
		// n - кількість рядків, m - кількість стовпчиків
		int[][] matr = new int[n][m];
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				 matr[i][j] = rnd.nextInt(10);
			}
		}
		return matr;
	}
	
	
	static void outputMatrix(int[][] matr) {
		for (int i = 0; i < matr.length; i++) {
			for (int j = 0; j < matr[0].length; j++) {
				 System.out.printf("%d ", matr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	static int elementsSum(int[][] matr) {
		int Sum = 0;
		for (int i = 0; i < matr.length; i++) {
			int j = 0;
			// знайдемо перший додатній елемент
			while (matr[i][j] <= 0 && j < matr[0].length - 1) {
				j++;
			}
			j++; // почануємо додавати з наступного за першим додатнім
			while (matr[i][j] > 0 && j < matr[0].length - 1) {
				if (j < matr[0].length - 1 && matr[i][j + 1] > 0)
					Sum += matr[i][j];
				j++;
			}
		}
		return Sum;
	}


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("n = ");
		int n = in.nextInt();
		System.out.printf("m = ");
		int m = in.nextInt();
		
		int[][] matr = generateRandomMatrix(n, m);
		System.out.println("\nРандомно згенерована матриця:");
		outputMatrix(matr); 
		
		System.out.printf("sum = %s\n", elementsSum(matr));
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_4.java
// (Example)
// <= java Task_2_4

// => n = <= 2
// => m = <= 3

// => Рандомно згенерована матриця:
// => 5 6 3 
// => 9 4 3 
// => sum = 10

