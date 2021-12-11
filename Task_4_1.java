/*
 * 4.1
 * Визначити клас Поліном з коефіцієнтами типу РаціональнийДріб.
 * Оголосити масив/список/множину із поліномів і визначити
 * суму поліномів масиву.
 * @author Дондов Станіслав
 */

public class Task_4_1 {
	public static void main(String[] args) {
		Polinom p1 = new Polinom();
		System.out.println("p1 = " + p1.toString());
		
		Polinom p2 = new Polinom();
		System.out.println("p2 = " + p2.toString());
		
		System.out.print("sum = ");
		p1.add(p2);
		System.out.println(p1.toString());
	}
}


//---------------(Terminal)---------------
// <= javac Task_4_1.java
// <= java Task_4_1 

// => p1 = 7/2*x^2 + 3/2*x^1 + 2x
// => p2 = 4/3*x^2 + 1/2*x^1 + 7/9x
// => sum = 29/6*x^2 + 2*x^1 + 25/9x

