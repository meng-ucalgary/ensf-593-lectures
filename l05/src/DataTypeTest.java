
public class DataTypeTest {

	public static void main(String[] args) {
		//concepts: promotion and casting
		
		double a = 65.8; // float 32 bits; double 64 bits
		char b = 'A';
		int c = (int)a;
		//do we need casting here or will these be promoted.
		int d = b;
		char e = (char)c;
		short f = (short)a;
		byte g = (byte)1040;
		
		//byte, long, boolean
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
		System.out.println("----------------------------------------");
		
		System.out.println("13/5 = "+ (13/5));
		System.out.println("13.0/5 = "+ (13.0/5));
		System.out.println("(int)13.5 / 5 = "+((int)13.5 / 5));
		System.out.println("13%5 = "+ (13%5));
		
		System.out.println("----------------------------------------");
		
		//change to double to see difference
		double x = 0;
		for(int i=0; i<10; i++) {
			x += 1.0/10.0;
			System.out.println(""+i+": "+x);
		}
		
	} 
}
