
/**
 * 
 * From UML Fig 9.9 p.404
 * 
 * @author 
 *
 */
public class LetterFreq {
	
	private char letter;
	private int freq;
	
	public LetterFreq(char l, int f) {
		this.letter = l;
		this.freq = f;
	}
	
	public char getLetter() {
		return this.letter;
	}
	
	public int getFreq() {
		return this.freq;
	}
	
	public void incrFreq() {
		this.freq++;
	}
	
	

}
