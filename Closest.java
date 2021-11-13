import java.util.Scanner;

/*
 * 1.5
 * Напишіть програму Closest.java що вводить з командного рядку числа
 * x, y, z (координату точки А) та читає з консолі масив чисел (xi, yi, zi),
 * і виводить ту з нових точок, що найближча до (x, y, z).
 * @author Дондов Станіслав
 */
 
public class Closest {
	/** Поле, що містить координати точки A */
	static double[] A;
	/** Поле, що містить координати найближчої точки до А */
	static double[] best_point = {Double.NaN, Double.NaN, Double.NaN};
	/** Відстань від А до найближчої точки */
	static double best_dist = Double.POSITIVE_INFINITY;

	/*
	 * Функція читає рядок вигляду (x, y, z) і повертає масив типу double {x, y, z}
	 */
	static double[] coords_to_double(String s) {
		s = s.replace("(", "").replace(")", "");
		String[] B = s.split(",", 3);
		double[] B_double = new double[3];
		for (int i = 0; i < B.length; i++) {
			B_double[i] = Double.parseDouble(B[i]);
		}
		return B_double;
	}
	
	/*
	 * Функція перевіряє чи є точка B ближчою до А за всі попередні
	 */
	static void checkDistance(double[] B) {
		double dist = Math.pow(A[0] - B[0], 2) + Math.pow(A[1] - B[1], 2) + Math.pow(A[2] - B[2], 2);
		if (dist < best_dist) {
			best_dist = dist;
			for (int i = 0; i < B.length; i++) 
				best_point[i] = B[i];
		}		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("A: ");
		A = coords_to_double(in.nextLine());
		
		int i = 1;
		String str = "";
		while (!"-".equals(str)) { // щоб вийти з циклу треба замість координат ввести "-"
			System.out.printf("B%d: ", i);
			str = in.nextLine();
			if ("-".equals(str))
				continue;
			double[] B = coords_to_double(str);
			checkDistance(B);
			i++;
		}
		System.out.printf("Closest point = (%f, %f, %f)\n", best_point[0], best_point[1], best_point[2]);
		in.close();
	}
}


//---------------(Terminal)---------------
// <= javac Closest.java
// <= java Closest

// => A: <= (0, 0, 0)
// => B1: <= (1, 2, 3)
// => B2: <= (-1, -1, -1)
// => B3: <= -
// => Closest point = (-1.000000, -1.000000, -1.000000)

