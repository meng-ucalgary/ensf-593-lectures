
public class StringManipulation {

	/**
	 * Ex. 7.18 p. 323
	 * Using StringBuilder or StringBuffer
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "abcdefghijklmnopqrstuvwxyz";
		String s2 = "hello world";
		
		//TODO a. Swap the front and back half of s1 giving a new string.
		StringBuilder b1 = new StringBuilder();
		b1.append(s1.substring(s1.length()/2));
		b1.append(s1.substring(0, s1.length()/2));
		System.out.println(b1);
		
		//TODO b. Swap ”world” and ”hello” in s2 giving a new string.
		StringBuffer b2 = new StringBuffer();
		b2.append(s2.substring(s2.indexOf('w')));
		b2.append(" ");
		b2.append(s2.substring(0, s2.indexOf(' ')));
		System.out.println(b2);
		
		//TODO c. Combine parts of s1 and s2 to create a new string ”hello abc”.
		

	}

}
