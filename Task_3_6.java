import java.util.Random;

/*
 * 3.6
 * Аліса кидає чесну монету, поки не побачить два послідовних орли.
 * Боб кидає ще одну чесну монету, поки не побачить орла, за яким
 * йде решка. Написати програму для оцінки ймовірності того, що Аліса
 * зробить менше кидків, ніж Боб? Рішення: 39/121.
 * @author Дондов Станіслав
 */
 
public class Task_3_6 {
	static Random rnd = new Random();
	// просимулюємо підкидання
	// нехай 1 = орел, 0 = решка
	static int coin1, coin2;
	
	public static void nextFlip() {
		coin1 = coin2;
		coin2 = rnd.nextInt(2);
	}
	
	public static int simulate(String p) {
		int cnt = 2;
		coin1 = rnd.nextInt(2);
		coin2 = rnd.nextInt(2);
		if ("Alice".equals(p)) {
			while (coin1 + coin2 != 2) {
				nextFlip();
				cnt++;
			}
		} else if ("Bob".equals(p)) {
			while (coin1 <= coin2) {
				nextFlip();
				cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		int n = 10000; // кількість експериментів
		// зі збільшенням n підвищуватиметься точність
		double cnt = 0;
		for (int i = 0; i < n; i++) {
			if (simulate("Alice") < simulate("Bob")) cnt++;
		}
		System.out.println("Ймовірність: " + cnt / n);
		System.out.printf("39/121 = %.5f\n", 39.0/121.0);
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_6.java
// <= java Task_3_6

// => Ймовірність: 0.3189
// => 39/121 = 0.32231

