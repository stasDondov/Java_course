package Task_5_14;


public class SimpleFraction extends Number {
    private int num; // numerator
    private int den; // denominator

    public SimpleFraction(int num, int den) {
    	super();
        this.num = num;
        this.den = den;
        reduceFraction();
    }
    
    public SimpleFraction() {
    	// якщо не вказувати параметри при ініціалізації, вони згенеруються рандомно
    	super();
        random();
        reduceFraction();
    }

	public int[] getFraction() {
		int[] ans = {this.num, this.den};
		return ans;
	}

    public void setNumerator(int num) {
        this.num = num;
    }

    public void setDenominator(int den) {
        this.den = den;
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int LCM(int a, int b) { // least common multiple
        return Math.abs(a * b) / gcd(a, b);
    }

    public void reduceFraction(){
        int red = gcd(Math.abs(num), den);
        this.num /= red;
        this.den /= red;
    }
    
    public void add(SimpleFraction other) {
    	int lcm = LCM(den, other.den);
    	num = num * (lcm / den) + other.num * (lcm / other.den);
    	den = lcm;
    	reduceFraction();
    }
    
    public void sub(SimpleFraction other) {
    	int lcm = LCM(den, other.den);
    	num = num * (lcm / den) - other.num * (lcm / other.den);
    	den = lcm;
    	reduceFraction();
    }
    
    public void mul(SimpleFraction other) {
    	num = num * other.num;
    	den = den * other.den;
    	reduceFraction();
    }
    
    public void div(SimpleFraction other) {
    	num = num * other.den;
    	den = den * other.num;
    	reduceFraction();
    }
    
    public void random() {
    	int n = (int)(Math.random() * 9) + 1;
        int d = (int)(Math.random() * 9) + 1;
        num = n;
    	den = d;
    	reduceFraction();
    }
    
    @Override
    public int hashCode(){
        return (int)(num/den*Math.pow(10, String.valueOf(Math.abs(den)).length()));
    }
    
    @Override
    public String toString(){
    	if (den == 1)
    		return num + "";
        return num + "/" + den;
    }
}

