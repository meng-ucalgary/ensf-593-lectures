
/**
 * 
 * Self-study Ex. 8.3 p. 345
 * 
 * @author pauc
 *
 */
public class B extends A{
	
//	@Override
//	public void method() { System.out.println("B"); }
	
	/**
	 * Self-study Ex. 8.4 p. 345
	 * 
	 * Re-implement such that parent method() is called first.
	 * 
	 */
	@Override
	public void method() { 
		super.method();
		System.out.println("B"); 
		}
	
	public static void main(String[] args) {
		
		//TODO predict output PRIOR running
		A a = new A(); 
		a.method(); // "A"
		a.method("-overloaded"); //"A-overloaded"
		a = new B();
		a.method(); // "B", "A\nB"
		B b = new B();
		b.method( ); // "B", "A\nB"
		b.method("-overloaded" ); //"A-overloaded"

	}

}
