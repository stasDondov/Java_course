/*
 * 1.1
 * Створіть клас, що містить неініціалізовані поля типів int, char та Ря-
 * док, і надрукуйте їх значення, щоб переконатися, що Java виконує
 * ініціалізацію за замовчуванням.
 * @author Дондов Станіслав
 */

class TestClass {
	int f1;
	char f2;
	String f3;
}

public class Task_1_1 {
	public static void main(String[] args) {
		TestClass c = new TestClass();
		System.out.println("int: " + c.f1);
		System.out.println("char: '" + c.f2 + "'");
		System.out.println("String: " + c.f3);
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_1.java
// <= java Task_1_1

// => int: 0
// => char: ''
// => String: null

