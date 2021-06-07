
/**
 * 
 * From UML Fig 9.11 p.405
 * 
 * @author 
 *
 */
public class AnalyzeFreq {
	
	private LetterFreq[] freqArr;
	
	public AnalyzeFreq() {
		
		freqArr = new LetterFreq[26];
		
		for(int i=0; i<freqArr.length; i++) {
			freqArr[i] = new LetterFreq((char)('A'+i), 0);
		}
		
	}
	
	public void countLetters(String str) {
		
		for(char c: str.toUpperCase().toCharArray()) {
			if(c >='A' && c<='Z') {
				freqArr[c-'A'].incrFreq();
			}
		}
		
	}
	
	public void printArray() {
		//traditional loop
//		for(int i=0; i<freqArr.length; i++) {
//			System.out.println(""+freqArr[i].getLetter()+": "+freqArr[i].getFreq());
//		}
		
		//enhanced or foreach loop
		for(LetterFreq l: freqArr) {
			System.out.println(""+l.getLetter()+": "+l.getFreq());
		}
	}
	
	
	
	public static void main(String[] argv) {
		AnalyzeFreq analyzer = new AnalyzeFreq();
		
		System.out.println("\n--- printArray() -------\n");
		analyzer.countLetters("A-HELLO-Z");
		analyzer.printArray();
		System.out.println("\n--- printArray()  -------\n");
		analyzer.countLetters("a-hello-z");
		analyzer.printArray();
		
		
	}
	
	

}
