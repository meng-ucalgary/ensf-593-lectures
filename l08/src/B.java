
/**
 * 
 * Self-study Ex. 8.3 p. 345
 * 
 * @author pauc
 *
 */
public class B extends A{
	
	public void method() { System.out.println("B"); }
	
	/**
	 * Self-study Ex. 8.4 p. 345
	 * 
	 * Re-implement such that parent method() is called first.
	 * 
	 */

	public static void main(String[] args) {
		
		//TODO predict output PRIOR running
		A a = new A(); 
		a.method( ); 
		a.method("-overloaded"); 
		a = new B();
		a.method(); 
		B b = new B();
		b.method( ); 
		b.method("-overloaded" ); 

	}

}
