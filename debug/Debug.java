package debug;

public class Debug {
	public static void debug(String[] args) {
		if (args.length == 0) {
		    System.out.println("no arguments");
	    } else {
			for(int i = 0; i < args.length; i++) {
			    System.out.print(args[i] + ", ");
			}
			System.out.println();
		}
    }
}
