/*
 * 3.5
 * Створіть клас під назвою Dog, що містить два члени-рядки: name і say.
 * У main() створіть два собачі об'єкти з іменами "spot" (каже: "Ruff!")
 * Та "scuffy" (каже "Wurf!"). Потім надрукуйте їхні імена та те, що вони
 * говорять. Створіть нове посилання на собаку та призначте її об'єкту 
 * "spot". Перевірте порівняння за допомогою == та equals() для всіх
 * посилань.
 * @author Дондов Станіслав
 */

public class Task_3_5 {
	public static void main(String[] args) {
		Dog dog1 = new Dog("spot", "Ruff!");
		Dog dog2 = new Dog("scuffy", "Wurf!");
		System.out.println(dog1.name + " says " + dog1.say);
		System.out.println(dog2.name + " says" + dog2.say);
		Dog spot = dog1;
		System.out.println(spot == dog1);
		System.out.println(spot.equals(dog1));
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_5.java
// <= java Task_3_5

// => spot says Ruff!
// => scuffy saysWurf!
// => true
// => true

