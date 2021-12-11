
public class PointInSpace {
    private ComplexNumber coords; // Re - x, Im - y 

    public PointInSpace(ComplexNumber coords) {
        this.coords = coords;
    }
    
    public PointInSpace() {
    	this.coords = new ComplexNumber();
    }

	public ComplexNumber getPoint() {
		return coords;
	}

    public void setX(int x) {
        this.coords.setRe(x);
    }

    public void setY(int y) {
        this.coords.setRe(y);
    }
    
    public double distanceToO() {
    	// повертає модуль комплекного числа
    	return Math.sqrt(Math.pow(coords.getRe(), 2) + Math.pow(coords.getIm(), 2));
    }
    
    public double distance(PointInSpace other) {
    	return Math.sqrt(Math.pow(coords.getRe() - other.coords.getRe(), 2) + Math.pow(coords.getIm() - other.coords.getIm(), 2));
    }

    @Override
    public String toString(){
        return "(" + coords.getRe() + ", " + coords.getIm() + ")";
    }
}

