import java.util.HashMap;
import java.util.ArrayList;

/*
 * 3.9
 * Визначити клас КолоНаПлощині. Визначити площу і периметр. Створити
 * масив/список/множину об'єктів і знайдіть групи кіл, центри
 * яких лежать на одній прямій. Визначити найбільший і найменший по
 * площі(периметру) об'єкт.
 * @author Дондов Станіслав
 */

public class Task_3_9 {
	public static CircleOnPlane maxArea(ArrayList<CircleOnPlane> cs) {
		double max = 0;
		CircleOnPlane maxCircle = new CircleOnPlane();
		for (CircleOnPlane c : cs) {
			if (c.area() > max) {
				maxCircle = c;
				max = c.area();
			}
		}
		return maxCircle;
	}
	
	public static ArrayList<CircleOnPlane> maxGroup(ArrayList<CircleOnPlane> cs) {
		HashMap<String, ArrayList<CircleOnPlane>> groups = new HashMap<>();
		int ind = 0;
	
		// "опорна" точка
		CircleOnPlane mc = cs.get(0);
		
		// додаємо в словник пари точок, щоб можна було використати рівняння прямої
		for (CircleOnPlane c : cs.subList(1, cs.size())) {
			ArrayList<CircleOnPlane> g = new ArrayList<CircleOnPlane>();
			g.add(mc);
			g.add(c);
			groups.put(Integer.toString(ind), g);
			ind++;
		}
	
		for (CircleOnPlane c : cs.subList(1, cs.size())) {
			for (ArrayList<CircleOnPlane> gr : groups.values()) {
				if (gr.indexOf(c) == -1 && c.isOnTheSameLine(gr.get(0), gr.get(1))) {
					gr.add(c);
				}
			}
		}
		
		ArrayList<CircleOnPlane> maxG = new ArrayList<CircleOnPlane>();
		int maxNum = 0;
		for (ArrayList<CircleOnPlane> gr : groups.values()) {
			if (gr.size() > maxNum) {
				maxG = gr;
				maxNum = gr.size();
			}
		}
		return maxG;
	}
	

	public static void main(String[] args) {
		ArrayList<CircleOnPlane> cs = new ArrayList<CircleOnPlane>();
		cs.add(new CircleOnPlane(new double[]{0, 3}, 5));
		cs.add(new CircleOnPlane(new double[]{0, 1}, 0.3));
		cs.add(new CircleOnPlane(new double[]{1, 2}, 70));
		cs.add(new CircleOnPlane(new double[]{2, -6}, 7));
		cs.add(new CircleOnPlane());
		// коло найбільщої площі має відповідно і найбільшу довжину
		System.out.println("\nНайбільшу площу має:\n" + maxArea(cs).toString());
		
		ArrayList<CircleOnPlane> maxG = maxGroup(cs);
		System.out.println("\nНайбільша група кіл, центри яких лежать на одній прямій:");
		for (CircleOnPlane c : maxG) {
			System.out.println(c);
		}
	}
}


//---------------(Terminal)---------------
// <= javac Task_3_9.java
// <= java Task_3_9 

// => Найбільшу площу має:
// => Коло з центром [1.0, 2.0] та радіусом 70.0

// => Найбільша група кіл, центри яких лежать на одній прямій:
// => Коло з центром [0.0, 3.0] та радіусом 5.0
// => Коло з центром [0.0, 1.0] та радіусом 0.3
// => Коло з центром [0.0, 0.0] та радіусом 1.0

