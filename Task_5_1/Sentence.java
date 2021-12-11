package Task_5_1;

public class Sentence {
	private Word[] words;
	private String heading = "";
	
	public Sentence(Word[] words) {
		this.words = words.clone();
	}
	
	public Sentence() {}
	
	public void setWords(Word[] words) {
		this.words = words;
	}
	
	public Word[] getWords() {
		return words;
	}
	
	@Override
    public String toString(){
        String res = "";
        for(Word s: words){
            res += s.toString() + " ";
        }
        res = res.substring(0, res.length() - 1) + ".";
        return res;
    }

    public boolean equals(Sentence other){
        if (words == null)
            return other.words == null;
        if(words.length != other.words.length)
            return false;
        for(int i = 0; i < words.length; i++) {
            if(!words[i].equals(other.words[i]))
                return false;
        }
        return true;
    }
    
    @Override
    public int hashCode(){
        int p = 31;
        int hash = 0;
        long p_pow = 1;
        for(Word s: words){
            hash = (int)(hash + s.hashCode() * p_pow);
            p_pow = p_pow*p;
        }
        return hash;
    }	
}
