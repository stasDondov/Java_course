public class CircleOnPlane {
	private double[] center; // координати центру кола
	private double R; // радіус кола
	
	public CircleOnPlane(double[] center, double R) {
		this.center = center;
		this.R = R;
	}
	
	public CircleOnPlane() {
		// дефолтні значення
		this.center = new double[]{0, 0};
		this.R = 1;
	}
	
	public double area() {
		return Math.PI * R * R;
	}
	
	public double perimeter() {
		return 2 * Math.PI * R;
	}
	
	public boolean isOnTheSameLine(CircleOnPlane T1, CircleOnPlane T2) {
		double x1 = T1.center[0];
		double y1 = T1.center[1];
		double x2 = T2.center[0];
		double y2 = T2.center[1];
		double x = center[0];
		double y = center[1];
		
		// коефіцієнти рівняння прямої
		double A = y2 - y1;
		double B = x1 - x2;
		double C = x1 * (y1 - y2) + y1 * (x2 - x1);
		if (A*x + B*y + C == 0) {
			return true;
		}
		return false;
		
	}
	
	@Override
    public String toString(){
        return "Коло з центром [" + center[0] + ", " + center[1] + "] та радіусом " + R;
    }
	
}

