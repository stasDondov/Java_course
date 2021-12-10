import paket.Student;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
 * 2.1
 * Створити класи, специфікації яких наведені нижче. Визначити для кожного
 * класу Type конструктори і методи setType(), getType(), toString(). Визна-
 * чити додатково методи в класі, що створює масив об'єктів. Задати критерій
 * вибору даних і вивесті ці дані на консоль. У кожному класі, що містить дані,
 * має бути оголошено декілька конструкторів.
 * Student: id, Прізвище, Ім'я, По батькові, Дата народження, адресу, те-
 * лефон, Факультет, Курс, Група. Створити масив об'єктів. Вивести:
 * a) список студентів заданого факультету; 
 * b) списки студентів для кожного факультету і курса;
 * c) списoк студентів, які народилися після заданого року;
 * d) список навчальної групи.
 * @author Дондов Станіслав
 */


public class Task_2_1 {
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Dondov Stanislav", "Kherson", new Date(2002, 06, 10), "mechmat", 3, "kompmat1"));
        students.add(new Student(2, "Ivan Ivanov", "Kiev", new Date(2001, 23, 07), "kubik", 4, "pzrk1"));
        students.add(new Student(3, "Petro Petrov", "Kiev", new Date(2003, 02, 03), "mechmat", 1, "stat1"));

		System.out.println("\na)");
        for (Student stud: students) {
            if (stud.getFaculty() == "mechmat") {
                System.out.println(stud.toString());
            }
        }

		System.out.println("\nb)");
		for (Student stud: students) {
            if(stud.getCourse() == 3) {
                System.out.println(stud.toString());
            }
        }
		
		System.out.println("\nc)");
        for (Student stud: students) {
            if(stud.getBirth().after(new Date(1995, 1, 1))) {
                System.out.println(stud.toString());
            }
        }
        
        System.out.println("\nd)");
        for (Student stud: students) {
            if(stud.getGroup() == "kompmat1") {
                System.out.println(stud.toString());
            }
        }
    }
}


//---------------(Terminal)---------------
// <= javac Task_2_1.java
// <= java Task_2_1 

// => a)
// => Student {Dondov Stanislav, mechmat, 3, kompmat1}
// => Student {Petro Petrov, mechmat, 1, stat1}

// => b)
// => Student {Dondov Stanislav, mechmat, 3, kompmat1}

// => c)
// => Student {Dondov Stanislav, mechmat, 3, kompmat1}
// => Student {Ivan Ivanov, kubik, 4, pzrk1}
// => Student {Petro Petrov, mechmat, 1, stat1}

// => d)
// => Student {Dondov Stanislav, mechmat, 3, kompmat1}

