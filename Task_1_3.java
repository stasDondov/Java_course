import paket.TestClass_1_3;

/*
 * 1.3
 * Створіть клас із загальнодоступними, приватними, захищеними поля-
 * ми та полями доступу до пакетів та членами методів. Створіть об'єкт
 * цього класу і подивіться, які повідомлення компілятора ви отримуєте, 
 * коли намагаєтесь отримати доступ до всіх членів класу. Майте на ува-
 * зі, що класи в одному каталозі є частиною пакета "за замовчуванням".
 * @author Дондов Станіслав
 */

public class Task_1_3 {
	public static void main() {
		TestClass_1_3 tc = new TestClass_1_3();
		tc.publicMessage();
		tc.privateMessage();
		tc.protectedMessage();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_3.java
// => Task_1_3.java:17: error: privateMessage() has private access in TestClass_1_3
// => 		tc.privateMessage();
// =>		  ^
// => Task_1_3.java:18: error: protectedMessage() has protected access in TestClass_1_3
// => 		tc.protectedMessage();
// => 		  ^
// => 2 errors

