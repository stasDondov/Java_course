/*
 * 3.1
 * Створіть клас, що містить неініціалізоване посилання на рядок. Про-
 * демонструйте, що Java посилання ініціалізує як null.
 * @author Дондов Станіслав
 */


class TestClass {
	String str;
}

public class Task_3_1 {
    public static void main(String[] args) {
    	TestClass tc = new TestClass();
    	System.out.println(tc.str);
    }
}


//---------------(Terminal)---------------
// <= javac Task_3_1.java
// <= java Task_3_1

// => null

