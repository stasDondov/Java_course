public class Dog {
	String name;
	String say;
	
	public static void bark(int a) {
		System.out.println("гавкання");
	}
	
	public static void bark(double a) {
		System.out.println("виття");
	}
	
	public static void bark(char a) {
		System.out.println("тощо");
	}
	
	public Dog(String n, String s) {
		name = n;
		say = s;
	}		
}

