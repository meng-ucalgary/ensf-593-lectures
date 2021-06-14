
/**
 * 
 * From UML Fig 9.9 p.404
 * 
 * @author Yves
 *
 */
public class LetterFreq implements Comparable { //TODO add Comparable interface
	
	private int freq;
	private char letter;
	
	public LetterFreq(char l, int f) {
		this.freq = f;
		this.letter = l;
	}
	
	public int getFrequency() {
		return this.freq;
	}
	
	public char getLetter() {
		return this.letter;
	}
	
	public void incrFreq() {
		this.freq++;
	}
	
	//TODO add compareTo() method
	@Override
	public int compareTo(Object obj) {
		LetterFreq that = (LetterFreq)obj;
		
		if(this.freq > that.freq) {
			return 1;
		}else if(this.freq < that.freq) {
			return -1;
		}else {
			return 0;
		}
	}
	
	
	//TODO add toString() method
	@Override
	public String toString() {
		
//		return String.format("%s(%d)", this.letter, this.freq);
		
		return ""+this.letter+"("+this.freq+")";
	}
	
	
	
	
	
	
	
	
	
	

}
