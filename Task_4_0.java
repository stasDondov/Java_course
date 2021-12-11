/*
 * 4.0
 * Створіть клас під назвою ConnectionManager, який керує фіксованим
 * масивом об'єктів Connection. Клієнт-програміст не повинен мати можливість
 * явно створювати об'єкти Connection, але може отримати їх лише статичним 
 * методом ConnectionManager. Коли у ConnectionManager закінчуються об'єкти,
 * він завершує роботу.
 * @author Дондов Станіслав
 */

public class Task_4_0 {
	public static void main(String[] args) {
		String mas[] = {"1", "2", "3"};
        ConnectionManager cm = new ConnectionManager(mas);
        while (cm.existConnection()) {
            cm.getConnection().show();
        }
	}
}


//---------------(Terminal)---------------
// <= javac Task_4_0.java
// <= java Task_4_0 

// => connection message: 1
// => connection message: 2
// => connection message: 3

