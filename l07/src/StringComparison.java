
public class StringComparison {
	
	/**
	 * Ex 7.16 p. 321
	 * 
	 * 
	 * TODO add all other variable definitions below
	 * 
	 * @startuml
	 * object "''java'', s1" as s1
	 * s1 : value="java"
	 * 
	 * 
	 * @enduml
	 */
	public static void main(String[] args) {
		String s1 = "java", s2 = "java", s3 = "Java"; 
		String s4 = new String(s2);
		String s5 = new String("java");
		
		System.out.println("a. s1 == s2 ");
		System.out.println("b. s1.equals(s2) ");
		System.out.println("c. s1 == s3 ");
		System.out.println("d. s1.equals(s3) "); 
		System.out.println("e. s2 == s3 ");
		System.out.println("f. s2.equals(s4) ");
		System.out.println("g. s2 == s4 ");
		System.out.println("h. s1 == s5 "); 
		System.out.println("i. s4 == s5 ");

	}

}
