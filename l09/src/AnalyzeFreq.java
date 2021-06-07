
/**
 * 
 * From UML Fig 9.11 p.405
 * 
 * @author 
 *
 */
public class AnalyzeFreq {
	
	
	
	
	
	
	
	public static void main(String[] argv) {
		AnalyzeFreq analyzer = new AnalyzeFreq();
		
		System.out.println("\n--- printArray() -------\n");
		analyzer.countLetters("A-HELLO-Z");
		analyzer.printArray();
		System.out.println("\n--- printHist()  -------\n");
		analyzer.countLetters("a-hello-z");
		analyzer.printArray();
		
		
	}
	
	

}
