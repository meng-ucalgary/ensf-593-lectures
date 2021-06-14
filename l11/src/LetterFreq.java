
/**
 * 
 * From UML Fig 9.9 p.404
 * 
 * @author Yves
 *
 */
public class LetterFreq { //TODO add Comparable interface
	
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
	
	
	//TODO add toString() method
	

}
