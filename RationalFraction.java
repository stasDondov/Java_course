
public class RationalFraction {
    private int num; // numerator
    private int den; // denominator

    public RationalFraction(int num, int den) {
        this.num = num;
        this.den = den;
    }
    
    public RationalFraction() {
    	// якщо не вказувати параметри при ініціалізації, вони згенеруються рандомно
        random();
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
    
    public void add(RationalFraction other) {
    	int lcm = LCM(den, other.den);
    	num = num * (lcm / den) + other.num * (lcm / other.den);
    	den = lcm;
    	reduceFraction();
    }
    
    public void sub(RationalFraction other) {
    	int lcm = LCM(den, other.den);
    	num = num * (lcm / den) - other.num * (lcm / other.den);
    	den = lcm;
    	reduceFraction();
    }
    
    public void mul(RationalFraction other) {
    	num = num * other.num;
    	den = den * other.den;
    	reduceFraction();
    }
    
    public void div(RationalFraction other) {
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
    public String toString(){
    	if (den == 1)
    		return num + "";
        return num + "/" + den;
    }
}
