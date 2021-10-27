/*
 * 1.4
 * Напишіть програму, яка демонструє, що незалежно від того, скільки
 * об'єктів ви створюєте для певного класу, у цьому класі є лише один
 * екземпляр певного статичного поля.
 */

class TestClass {
	static int field = 1;
}

public class Task_1_4 {
	public static void main(String[] args) {
		TestClass a1 = new TestClass();
		TestClass a2 = new TestClass();
		System.out.println(a1.field);
		a2.field = 2;
		System.out.println(a1.field);
		System.out.println(TestClass.field == a1.field && a1.field == a2.field);
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_4.java
// <= java Task_1_4

// => 1
// => 2
// => true

