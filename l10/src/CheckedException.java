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


	public static void main(String[] args){
		
		Scanner s = new Scanner(new File("test.txt")); 

	}

}
