import java.util.Scanner;

/*
 * 1.3
 * Напишіть програму, що приймає з консолі число n, читає n дійсних 
 * чисел з консолі, та знаходить середнє з цих чисел(mean) та відхилення
 * (sample standart deviation).
 * @author Дондов Станіслав
 */

public class Task_1_3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n = ");
		int n = in.nextInt();
		
		double[] numArray = new double[n];
		double sum = 0;
		System.out.print("Your numbers: ");
		for (int i = 0; i < n; i++) {
			numArray[i] = in.nextDouble();
			sum += numArray[i];
		}
		double mean = sum / n;
		System.out.println("Mean: " + mean);
		
		double standardDeviation = 0.0;
		for (double num: numArray) {
			standardDeviation += Math.pow(num - mean, 2);
		}
		System.out.println("Standard deviation: " + Math.sqrt(standardDeviation / n));
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_3.java
// <= java Task_1_3

// => n = <= 5
// => Your numbers: <= 1.2 3.4 -5.6 7.8 0.1
// => Mean: 1.38
// => Standard deviation: 4.374654272053964

