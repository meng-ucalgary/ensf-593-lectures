import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TextAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String fileName = "test.txt";
		Scanner s = null;
		// TODO Create a Scanner using File and fileName
		try {
			s = new Scanner(new File(fileName));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(-1);//non-zero exit means something went wrong
		}
		
		
		
		//TODO add while loop, as long as lines left in scanner
		//  - get the line
		//  - count words, add to total
		//  - count sentences, add to total
		int numOfWords = 0;
		int numOfSentences=0;
		while(s.hasNextLine()) {
			String line = s.nextLine();
			numOfWords += countWords(line);
			numOfSentences += countSentences(line);
		}
		
		s.close();
		
		System.out.println("*** Analyzing "+fileName);
		
		// 201: wc -w test.txt
		System.out.println("  Number of Words: "+numOfWords);
		
		// 23: grep -o -e '[\?\.!]' test.txt | wc -l 
		System.out.println("  Number of Sentences: "+numOfSentences);

	}

	private static int countWords(String line) {
		// TODO create StringTokenizer with line and split on space
		StringTokenizer tok = new StringTokenizer(line);
		return tok.countTokens();
	}
	
	private static int countSentences(String line) {
		// TODO create StringTokenizer with line and split on .!?
		StringTokenizer tok = new StringTokenizer(line, ".!?");
		return tok.countTokens();
	}

}
