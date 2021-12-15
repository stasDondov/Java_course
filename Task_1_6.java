import java.util.Scanner;

/*
 * 1.6
 * Напишіть програму, яка в кінець рядка додасть новий рядок
 * ", that we use to ilustrate the methods of class StringBuffer" не створюючи
 * нового рядка.
 * @author Дондов Станіслав
 */

public class Task_1_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Your text: ");
		String str = sc.nextLine();
		StringBuffer strBuffer = new StringBuffer(str);
		strBuffer.append(", that we use to ilustrate the methods of class StringBuffer");
		System.out.println(strBuffer);
		sc.close();
	}
}


//---------------(Terminal)---------------
// <= javac Task_1_6.java
// <= java Task_1_6 

// => Your text: <= aaa
// => aaa, that we use to ilustrate the methods of class StringBuffer

