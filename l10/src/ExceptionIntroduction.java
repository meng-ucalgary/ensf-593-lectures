/**
 * 
 * Unchecked exceptions.
 * 
 * Multiple catch block, specific to general.
 * 
 * Finally always executed, used for cleaning up resources.
 * 
 */
public class ExceptionIntroduction {


	public static void main(String[] args) {
		String input = "26.2";
		int num = 0;
		int div = 0;
		try{
			num = Integer.parseInt(input); //which exception?
			num = num / div; //which exception?
		}
		//TODO add a catch block to catch NumberFormatException
		
		//TODO add second block to catch all exceptions
		
		//TODO add finally block printing the number
		
	} 
}


