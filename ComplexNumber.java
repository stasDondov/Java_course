
public class ComplexNumber {
    private int Re; // дійсна частина
    private int Im; // уявна частина

    public ComplexNumber(int Re, int Im) {
        this.Re = Re;
        this.Im = Im;
    }
    
    public ComplexNumber() {
    	this.Re = 0;
        this.Im = 0;
    }

	public int getRe() {
		return Re;
	}
	
	public int getIm() {
		return Im;
	}

    public void setRe(int Re) {
        this.Re = Re;
    }

    public void setIm(int Im) {
        this.Im = Im;
    }
     
    public void add(ComplexNumber other) {
    	Re = Re + other.Re;
    	Im = Im + other.Re;
    }
    
    public void sub(ComplexNumber other) {
    	Re = Re - other.Re;
    	Im = Im - other.Im;
    }
    
    public ComplexNumber conjugate() {
    	// повертає спряжене до даного комплексного числа
    	ComplexNumber con = new ComplexNumber(Re, -Im);
    	return con;
    }
    
    public void mul(ComplexNumber other) {
    	Re = Re * other.Re - Im * other.Im;
    	Im = Re * other.Im + Im * other.Re;
    }
    
    public void div(ComplexNumber other) {
    	int a = Re;
    	int b = Im;
    	int c = other.Re;
    	int d = other.Im;
    	Re = (a*c + b*d) / (c*c + d*d);
    	Im = (b*c - a*d) / (c*c + d*d);
    }
    
    @Override
    public String toString(){
        return Re + " + " + Im + "i";
    }
}

