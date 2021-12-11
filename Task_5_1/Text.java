package Task_5_1;


public class Text {
    private Sentence[] text;
    public String heading;

    public Text(Sentence[] text) {
        this.text = text;
    }
    
    public Text() {}

    public Sentence[] getText() {
        return text;
    }

    public void setText(Sentence[] text) {
        this.text = text;
    }
    
    public void setHeading(String heading) {
    	this.heading = heading;
    }
    
    public String getHeading() {
    	return heading;
    }

    @Override
    public String toString() {
        String res = "";
        for (Sentence s: text) {
            res += s.toString();
        }
        return res;
    }

    public boolean equals(Text other){
        if (text == null)
            return other.text == null;
        if(text.length != other.text.length)
            return false;
        for(int i = 0; i < text.length; i++) {
            if(!text[i].equals(other.text[i]))
                return false;
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        int p = 31;
        int hash = 0;
        long p_pow = 1;
        for(Sentence s: text){
            hash = (int)(hash + s.hashCode() * p_pow);
            p_pow = p_pow*p;
        }
        return hash;
    }
}

