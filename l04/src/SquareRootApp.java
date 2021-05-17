
/**
 * Code from Fig. 4.9 p. 159
 * 
 * @author Yves
 *
 */
public class SquareRootApp{ 
	private KeyboardReader reader;
	
	public SquareRootApp(){ 
		reader = new KeyboardReader(); 
	} // GreeterApp ()

	public void run(){ 
		double number = 1.0;
		reader.prompt("Please input a positive number, e.g 2.0 > "); 
		number = reader.getKeyboardDouble ( ) ;
		reader.display("Sqare root of "+number+
				        " = " + NewtonSquareRoot.getSquareRoot(number)) ; 
	}// run()
	

	public static void main(String args[]){ 
		SquareRootApp app = new SquareRootApp();
		app.run();
	}
} // GreaterApp
