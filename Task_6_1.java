import Task_6_1.Flowers.Daisy;
import Task_6_1.Flowers.Rose;
import Task_6_1.Flowers.Tulip;
import Task_6_1.Accessories;
import Task_6_1.Flower;
import Task_6_1.Bouquet;

/*
 * 6.1
 * Квіткарня. Визначити ієрархію квітів. Створити кілька об'єктів-квіток.
 * Зібрати букет (використовуючи аксесуари) з визначенням його вартості.
 * Провести сортування квітів на основі рівня свіжості. Знайти квітку в букеті,
 * що відповідає заданому діапазону довжини стебля.
 * @author Дондов Станіслав
 */

public class Task_6_1 {
	public static void main(String[] args) {
		Daisy daisy = new Daisy(7, 0.58, 1);
		Rose rose1 = new Rose(10, 0.45, 2);
		Rose rose2 = new Rose(12, 0.49, 1);
		Tulip tulip = new Tulip(5, 0.51, 3);
		Accessories decor = new Accessories(0.7);
		
		Flower[] flws = new Flower[]{daisy, rose1, rose2, tulip};
		Accessories[] ac = new Accessories[]{decor};
		Bouquet b = new Bouquet(flws, ac);
		b.sortFlowers();
		System.out.println(b);
		
		System.out.println("Ціна букету: " + b.getPrice() + "$");
		System.out.println("Шукана квітка:" + b.goodLength(0.4, 0.5));
	}
}


//---------------(Terminal)---------------
// <= javac Task_6_1.java
// <= java Task_6_1 

// => Bouquet consists of 
// => daisy 7.0$ 0.58sm 1
// => rose 12.0$ 0.49sm 1
// => rose 10.0$ 0.45sm 2
// => tulip 5.0$ 0.51sm 3
// => decor 0.7$
// => Ціна букету: 34.7$
// => Шукана квітка:rose 12.0$ 0.49sm 1

