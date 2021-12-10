import java.util.Scanner;
import java.util.Random;

/*
 * 2.2
 * Виконати циклічний зсув заданої матриці на k позицій вправо (вліво,
 * вгору, вниз).
 * @author Дондов Станіслав
 */

public class Task_2_2 {

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
	
	static void cyclicShift(int[][] matr, int k) {
		// зсуває матрицю вліво на k позицій
        for (int i = 0; i < matr.length; i++) {
            int[] row = new int[matr[i].length];
            for (int j = 0; j < matr[i].length; j++) {
                //if (j + k < matr[i].length)
                //    row[j] = matr[i][j + k];
                //else
                //    row[j] = matr[i][j + k - matr[i].length];
                row[j] = matr[i][(j + k) % matr[i].length];
            }
            for (int j = 0; j < matr[i].length; j++) {
                matr[i][j] = row[j];
            }
        }
    }
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// вводимо розміри матриці
		System.out.printf("n = ");
		int n = in.nextInt();
		System.out.printf("m = ");
		int m = in.nextInt();
		
		int[][] matr = generateRandomMatrix(n, m);
		System.out.println("\nРандомно згенерована матриця:");
		outputMatrix(matr); 
		
		System.out.printf("\nk = ");
		int k = in.nextInt();
	
		cyclicShift(matr, k);
		outputMatrix(matr); 
	
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_2.java
// (Example)
// <= java Task_2_2

// => n = <= 3
// => m = <= 3

// => Рандомно згенерована матриця:
// => 2 8 9 
// => 5 0 2 
// => 6 4 9 

// => k = <= 1
// => 8 9 2 
// => 0 2 5 
// => 4 9 6 

