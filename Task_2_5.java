import java.util.ArrayList;
import java.util.List;

/*
 * 2.5
 * Створити класи, специфікації яких наведені нижче. Визначити для кожного
 * класу Type конструктори і методи setType(), getType(), toString(). Визна-
 * чити додатково методи в класі, що створює масив об'єктів. Задати критерій
 * вибору даних і вивесті ці дані на консоль. У кожному класі, що містить дані,
 * має бути оголошено декілька конструкторів.
 * Book: id, Назва, Автор(и), Видавництво, Рік видання, Кількість сторінок, Ціна
 * Тип переплета. Створити масив об'єктів. Вивести: 
 * a) список книг заданого автора;
 * b) список книг заданого видавництва;
 * c) список книг, надрукованих після заданого року.
 * @author Дондов Станіслав
 */

public class Task_2_5 {
	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Bukvar", "-", "ababagalamaga", 2000, 20, 50, "-"));
        books.add(new Book(2, "Kobzar", "Shevchenko", "kniga", 1980, 50, 200, "-"));
		books.add(new Book(3, "Zakhar Berkut", "Franko", "ababagalamaga", 1995, 300, 150, "-"));
		books.add(new Book(4, "Lis Mikita", "Franko", "kniga", 2008, 43, 80, "-"));
		
		System.out.println("\na)");
        for (Book b: books) {
            if (b.getAuthor() == "Franko") {
                System.out.println(b.toString());
            }
        }
        
        System.out.println("\nb)");
        for (Book b: books) {
            if (b.getPublHouse() == "kniga") {
                System.out.println(b.toString());
            }
        }
        
        System.out.println("\nc)");
        for (Book b: books) {
            if (b.getYear() > 1999) {
                System.out.println(b.toString());
            }
        }
	}
}


//---------------(Terminal)---------------
// <= javac Task_2_5.java
// <= java Task_2_5

// => a)
// => Zakhar Berkut, Franko, 1995, ababagalamaga
// => Lis Mikita, Franko, 2008, kniga

// => b)
// => Kobzar, Shevchenko, 1980, kniga
// => Lis Mikita, Franko, 2008, kniga

// => c)
// => Bukvar, -, 2000, ababagalamaga
// => Lis Mikita, Franko, 2008, kniga

