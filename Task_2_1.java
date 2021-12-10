import java.util.Scanner;
import java.util.Random;

/*
 * 2.1
 * Впорядкувати рядки (стовпці) матриці в порядку зростання значень
 * елементів k-го стовпця (рядка).
 * @author Дондов Станіслав
 */

public class Task_2_1 {

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
	
	
	static void sortByRow(int[][] matr, int k) {
		// k - індекс рядка за яким сортувати
		int N = matr.length; // кол-во строк
		int M = matr[0].length; // кол-во столбцв
		for (int i = 0; i < N; i++){ // для каждой строки
            for (int l = 0; l < M - 1; l++){ // для каждого столбца
                if (matr[k][l + 1] < matr[k][l]){
                    for (int j = 0; j < N; j++){ 
                        int temp = matr[j][l];
                        matr[j][l] = matr[j][l + 1];
                        matr[j][l + 1] = temp;
                    }
                }
            }       
		}	
	}


	static void sortByColumn(int[][] matr, int k) {
		// k - індекс стовпчика за яким сортувати
		int N = matr.length; // кол-во строк
		int M = matr[0].length; // кол-во столбцв
		for (int i = 0; i < M; i++){
            for (int l = 0; l < N - 1; l++){
                if (matr[l + 1][k] < matr[l][k]){
                    for (int j = 0; j < M; j++){
                        int temp = matr[l][j];
                        matr[l][j] = matr[l + 1][j];
                        matr[l + 1][j] = temp;
                    }
                }
            }       
		}	
	}
	

	public static void main(String[] args) {
		/*
		 * args[0] = 1 if you want to sort by values of row
		 * args[0] = 2 if you want to sort by values of column
		 */
		Scanner in = new Scanner(System.in);
		
		System.out.printf("n = ");
		int n = in.nextInt();
		System.out.printf("m = ");
		int m = in.nextInt();
		
		int[][] matr = generateRandomMatrix(n, m);
		System.out.println("\nРандомно згенерована матриця:");
		outputMatrix(matr); 
		
		System.out.printf("\nk = "); // k - номер стовпця/рядка за яким сортувати
		int k = in.nextInt();
		
		if ("1".equals(args[0])) {
			sortByRow(matr, k);
		} else if ("2".equals(args[0])) {
			sortByColumn(matr, k);
		} 
		outputMatrix(matr);
		
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_1.java
// (Example)
// <= java Task_2_1 1

// => n = <= 3
// => m = <= 4

// => Рандомно згенерована матриця:
// => 2 8 0 4 
// => 8 2 7 5 
// => 9 9 9 5 

// => k = <= 2
// => 4 2 8 0 
// => 5 8 2 7 
// => 5 9 9 9 

