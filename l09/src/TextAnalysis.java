import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fileName = "test2.txt";
		Scanner s = null;
		try {
			s = new Scanner( new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1); //non-zero exit indicates problem
		}
		
		String line;
		int numOfWords=0;
		int numOfSentences=0;
		while(s.hasNextLine()) {
			line = s.nextLine();
			numOfWords += countWords(line);
			numOfSentences += countSentences(line);
			
			
		}
		
		System.out.println("*** Analyzing "+fileName);
		
		// 201: wc -w test.txt
		System.out.println("  Number of Words: "+numOfWords);
		
		// 23: grep -o -e '[\?\.!]' test.txt | wc -l 
		System.out.println("  Number of Sentences: "+numOfSentences);

	}

	private static int countWords(String line) {
		// TODO Auto-generated method stub
//		StringTokenizer tok = new StringTokenizer(line);
//		return tok.countTokens();
		
		String[] tok = line.trim().split("\\s");
		
//		for(int i=0; i< tok.length;i++) {
//			System.out.println(""+i+":##"+tok[i]+"##");
//		}
		if(tok.length == 1 && tok[0].equals("")) return 0;
		else return tok.length;
		
		
	}
	
	private static int countSentences(String line) {
		// TODO Auto-generated method stub
//		StringTokenizer tok = new StringTokenizer(line, ".!?");
//		return tok.countTokens();
		
		String[] tok = line.trim().split("[.!?]");
		
		if(tok[0].equals("")) return 0;
		else return tok.length;
		
	}

}
