/*
 * 3.2
 * Створіть клас із полем String, ініціалізованим у точці визначення, та
 * іншим полем, ініціалізованим конструктором. Чим відрізняються два
 * підходи?
 * @author Дондов Станіслав
 */


public class Task_3_2 {
    public static void main(String[] args) {
    	TestClass_3_2 tc = new TestClass_3_2();
    	System.out.println(tc.str1);
    	System.out.println(tc.str2);
    }
}


//---------------(Terminal)---------------
// <= javac Task_3_2.java
// <= java Task_3_2

// => str1
// => null

