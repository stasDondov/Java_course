
public class Polinom {
	RationalFraction[] cfs;

    public Polinom(RationalFraction[] cfs) {
        this.cfs = cfs;
    }
    
    public Polinom() {
    	random();
    }
    
    public void random() {
    	// якщо при ініціалізації не вказати список коефіцієнтів, то сгенерується рандомний списк довжини 3
    	cfs = new RationalFraction[]{new RationalFraction(), new RationalFraction(), new RationalFraction()};
    }

    public RationalFraction[] getPolinom() {
        return cfs;
    }

    public void setPolinom(RationalFraction[] cfs) {
        this.cfs = cfs;
    }

    public void add(Polinom other){
        if (cfs.length != other.cfs.length) {
            System.out.println("поліноми мають бути однакової довжини!");
        } else {
            for(int i = 0; i < cfs.length; i++) {
                //list.get(i).add(polinom.list.get(i));
                cfs[i].add(other.cfs[i]); 
            }
        }
    }

    @Override
    public String toString(){
        String str = "";
        for(int i = cfs.length - 1; i > 0; i--) {
            str += cfs[i].toString() + "*x^" + i + " + ";
        }
        str += cfs[0].toString() + "x";
        return str;
    }
}

