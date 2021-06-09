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
		String input = "26";
		int num = 0;
		int div = 2;
		try{
			num = Integer.parseInt(input); //which exception? NumberFormatException
			num = num / div; //which exception? ArithmeticException
		}catch(NumberFormatException e) {
		//TODO add a catch block to catch NumberFormatException
			System.out.println("First catch block");
			System.out.println(e);
			e.printStackTrace();
		}catch(Exception e) {
		//TODO add second block to catch all exceptions
			System.out.println("Second catch block");
			System.out.println(e);
			e.printStackTrace();
		}finally {
		//TODO add finally block printing the number
			System.out.println("finally block");
			System.out.println("The number is: "+num);
		}
		
	} 
}


