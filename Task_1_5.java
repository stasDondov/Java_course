import debug.Debug;
import debugoff.Debugoff;

/*
 * 1.5
 * Створіть два пакети: debug та debugoff, що містять ідентичний клас із методом debug().
 * Перша версія відображає аргументи типа String (довільну кількість) на консолі, друга не
 * відображає. Використовуйте static import, щоб імпортувати клас у тестову програму, і 
 * продемонструйте ефект заміни класу щоб відображати та не відображати аргументи.
 * @author Дондов Станіслав
 */

public class Task_1_5 {
	public static void main(String[] args) {
		Debug.debug(args);
		Debugoff.debug(args);
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_5.java
// <= java Task_1_5

// => 1, 2, 3, 

