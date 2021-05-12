
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
	
	@Override
	public boolean equals(Object obj) {
		
		// We need to have an object in memory
		if(obj == null) {
			return false;
		}
		
		// We need a Student object
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		Student that = (Student)obj;
		return this.id.equals(that.id);
		
	}
	
//	public boolean equals(Student that) {
//		return this.id.equals(that.id);
//	}
	


}
