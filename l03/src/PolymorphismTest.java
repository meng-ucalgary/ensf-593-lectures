
public class PolymorphismTest {

	public static void main(String[] args) {
		
		// Testing toString()
		
		Object obj; // obj can refer to any Object
		obj = new Student("12345");// obj refers to a Student
		System.out.println(obj.toString()); // Prints "12345"
		obj = new MinimalOneRowNim(11); // obj refers to a MinimalOneRowNim
		System.out.println(obj.toString());
		// Prints: nSticks = 11, player = 1
		
		
		// Testing equals()
		Object s0 = new Student("12345"); //Student("12345");
		Object s1 = new Student("12345"); //Student("12345");
		Object s2 = s0;
		
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s0.equals(s1)); //true
		System.out.println(s0 == s1); //false
		System.out.println(s0 == s2); //true
		

	}

}
