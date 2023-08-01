/*
 * Represents a set in a classroom
 * Each seat has a row and column associated with it.
 * It also Might have a student assigned to it.
 * @author Kai
 */
public class Student {

	//instance vars
	
	/*
	 * Name of student
	 */
	String name;
	
	/*
	 * ID of student.
	 */
	String ID;
	
	// constructor
	
	/*
	 * Creates a student with the given name and ID.
	 * @param name of student
	 * @param ID for student
	 */
	public Student(String name, String ID) {
		this.name = name;
		this.ID = ID;
	}
	
	/*
	 * Returns name of student.
	 */
	public String toString() {
		return this.name;
	}
}
