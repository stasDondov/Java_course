/*
 * 3.4
 * Ініціалізуйте наступні числа як дійсні, подвійні дійсні та довгі дійсні: 
 * 10^(-4);
 * 2.33E5;
 * pi;
 * e;
 * sqrt(5);
 * ln(100);
 * @author Дондов Станіслав
 */

public class Task_3_4 {
	public static void main(String[] args) {
		// Дійсні
		float b1 = (float) Math.pow(10, -4);
		float b2 = (float) 2.33E5;
		float b3 = (float) Math.PI;
		float b4 = (float) Math.E;
		float b5 = (float) Math.sqrt(5);
		float b6 = (float) Math.log(100);
		System.out.println(b1 + ", " + b2 + ", " + b3 + ", " + b4 + ", " + b5 + ", " + b6);
		// Подвійні дійсні
		double a1 = Math.pow(10, -4);
		double a2 = 2.33E5;
		double a3 = Math.PI;
		double a4 = Math.E;
		double a5 = Math.sqrt(5);
		double a6 = Math.log(100);
		System.out.println(a1 + ", " + a2 + ", " + a3 + ", " + a4 + ", " + a5 + ", " + a6);
		// Довгі дійсні в мові С
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_1.java
// <= java Task_3_1

// => 1.0E-4, 233000.0, 3.1415927, 2.7182817, 2.236068, 4.6051702
// => 1.0E-4, 233000.0, 3.141592653589793, 2.718281828459045, 2.23606797749979, 4.605170185988092

