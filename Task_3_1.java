/*
 * 3.1
 * Визначити клас РаціональнийДріб у вигляді пари чисел m і n. Оголосити
 * та ініціалізувати масив із k дробів, вивести/ввести значення для масиву дробів.
 * Створити масив/список/множину об'єктів і передати його в метод, який змінює
 * кожен елемент масиву індексом шляхом додавання наступного за ним елементу.
 * @author Дондов Станіслав
 */

public class Task_3_1 {
	public static void main(String[] args) {
        
        // генеруємо випадкові дроби
        int k = 10;
        RationalFraction[] arr = new RationalFraction[10];
        for (int i = 0; i < k; i++) {
        	arr[i] = new RationalFraction();
        }
        
        // виведемо ці числа
        for (int i = 0; i < k; i++) {
        	System.out.print(arr[i] + "  ");
        }
        
        // оберемо рандомні елементи створеного масиву та виконаємо операції над ними
        int k1 = (int)(Math.random() * 10);
        int k2 = (int)(Math.random() * 10);
        RationalFraction f1 = arr[k1];
        RationalFraction f2 = arr[k2];
        
        System.out.printf("\n%s + %s = ", f1.toString(), f2.toString());
        f1.add(f2);
        System.out.print(f1);
        
        System.out.printf("\n%s * %s = ", f1.toString(), f2.toString());
        f1.mul(f2);
        System.out.print(f1);
        
        System.out.printf("\n%s - %s = ", f1.toString(), f2.toString());
        f1.sub(f2);
        System.out.print(f1);
        
        System.out.printf("\n%s / %s = ", f1.toString(), f2.toString());
        f1.div(f2);
        System.out.println(f1);
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_1.java
// <= java Task_3_1 

// => 4/8  4/2  3/7  6/8  2/2  3/4  2/8  9/7  1/2  3/5  
// => 1/2 + 3/5 = 11/10
// => 11/10 * 3/5 = 33/50
// => 33/50 - 3/5 = 3/50
// => 3/50 / 3/5 = 1/10


