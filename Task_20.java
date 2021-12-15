import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*
 * 20
 * Знайти всі дати за американським стандартом та замінити їх на укра-
 * їнський запис дати.
 * @author Дондов Станіслав
 */

public class Task_20 {
	public static void main(String[] args) {
		String text = "sjfdvb  1999-10-02sdv2000-06-01";
		
		Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
		Matcher matcher = pattern.matcher(text);
		
		while (matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			String[] oldDate = text.substring(start, end).split("-");
			String newDate = oldDate[2] + "-" + oldDate[1] + "-" + oldDate[0];
			text = text.replace(text.substring(start, end), newDate);
		}
		System.out.println(text);
	}
}


//---------------(Terminal)---------------
// <= javac Task_20.java
// <= java Task_20

// => sjfdvb  02-10-1999sdv01-06-2000

