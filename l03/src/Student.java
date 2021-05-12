
public class Student extends Object{
	//TODO add instance variables, 
	//     Constructor, 
	//     toString method and
	//     equals method.
	
	private String id;
	
	public Student(String studentID) {
		this.id = studentID;
	}
	
	@Override
	public String toString() {
		return this.id;
		
	}
	
	public boolean equals(Student that) {
		return this.id.equals(that.id);
	}
	


}
