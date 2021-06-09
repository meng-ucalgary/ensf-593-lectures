import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 *Checked exceptions need to be handled, else compiler complains:
 * - throw it for others to handle
 * - use try-catch to handle it
 *
 */
public class CheckedException {

	public static void openFile(String filename) throws FileNotFoundException {
		
		Scanner s = new Scanner(new File(filename));
	}

	public static void main(String[] args) throws FileNotFoundException{
		
		
		openFile("test.txt");
		
//		Scanner s = new Scanner(new File("test.txt"));
		
//		try {
//			Scanner s = new Scanner(new File("test.txt"));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 

	}

}
