/*
 * 3.3
 * Напишіть програму RollDie.java, яка генерує результат кидання
 * чесного шестигранного кубика (ціле число від 1 до 6).
 * @author Дондов Станіслав
 */
 
public class RollDie {
	public static void main(String[] args) {
		System.out.printf("Кубик: %d\n", 1 + (int)(Math.random() * 6));
	}
}


//---------------(Terminal)---------------
// <= javac RollDie.java
// <= java RollDie

// => Кубик: 3  # приклад виконання

