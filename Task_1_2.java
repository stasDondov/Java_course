import paket.TestClass_1_1;

/*
 * 1.2
 * Покажіть, що захищені методи мають доступ до пакетів, але не є за-
 * гальносдоступними.
 * @author Дондов Станіслав
 */

public class Task_1_2 {
	public static void main() {
		TestClass_1_1 tc = new TestClass_1_1();
		tc.showMessage();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_2.java
// => Task_1_2.java:13: error: showMessage() has protected access in TestClass_1_1
// =>		tc.showMessage();
// =>		  ^
// => 1 error

