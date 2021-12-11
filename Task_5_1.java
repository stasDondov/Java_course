import Task_5_1.Word;
import Task_5_1.Sentence;
import Task_5_1.Text;

/*
 * 5.1
 * Створити об'єкт класу Текст, використовуючи класи Речення, Слово.
 * Методи: доповнити текст, вивести на консоль текст, заголовок тексту.
 * @author Дондов Станіслав
 */

public class Task_5_1 {
	public static void main(String[] args) {
		Word w1 = new Word("на");
		Word w2 = new Word("вулиці");
		Word w3 = new Word("хороша");
		Word w4 = new Word("погода");
		Word[] ws1 = new Word[]{w1, w2, w3, w4};
		Sentence s1 = new Sentence(ws1);
		
		Word w5 = new Word("завтра");
		Word w6 = new Word("обіцяють");
		Word w7 = new Word("дощ");
		Word[] ws2 = new Word[]{w5, w6, w7};
		Sentence s2 = new Sentence(ws2);
		
		Sentence[] sc = new Sentence[]{s1, s2};
		Text t = new Text(sc);
		t.setHeading("Осінь");
		
		System.out.println(t.heading);
		System.out.println(t);
	}
}


//---------------(Terminal)---------------
// <= javac Task_5_1.java
// <= java Task_5_1 

// => Осінь
// => на вулиці хороша погода.завтра обіцяють дощ.

