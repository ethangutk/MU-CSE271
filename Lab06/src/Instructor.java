/**
 * @author Ethan Gutknecht
 * @apiNote Class is a subclass of the person class
 */
	
	
	
public class Instructor extends Person {
	//variables
	private String rank;
	
	
	/**
	 * @apiNote creates instructor with defults 
	 */
	public Instructor() {
		super();
		this.rank = null;
	}
	
	
	/**
	 * @apiNote creates instructor with parameters 
	 */
	public Instructor(String name, int yob, String rank) {
		super(name, yob);
		this.rank = rank;
	}
	
	
	/**
	 * @apiNote compares two objects to see if they are equal
	 * @return boolean true if equal
	 */
	public boolean equals(Object obj) {
		//make sure obj is a student
		if (obj instanceof Instructor) {
			Instructor i = (Instructor)obj;
			if (this.rank.equals(i.rank) && super.equals(i)) return true;
			else return false; //if rank doesn't match return false
		}
		else return false; //if it is not an instructor return false
	}
	
	
	/**
	 * @apiNote turns values into string with correct grammar
	 * @return  String returns string of values
	 */
	public String toString() {
		if (this.rank.charAt(0) == 'a' ||
			this.rank.charAt(0) == 'e' ||
			this.rank.charAt(0) == 'i' ||
			this.rank.charAt(0) == 'o' ||
			this.rank.charAt(0) == 'u') {
			return "I am an " + this.rank + ". " + super.toString(); //an rank
		}
		else return "I am a " + this.rank + ". " + super.toString(); //a rank (did this for correct grammar lol)
	}

	
	/**
	 * @apiNote retrieves rank of instructor
	 * @return  String returns rank
	 */
	public String getRank() { //gets rank
		return rank;
	}

	
	/**
	 * @apiNote sets rank of instructor
	 * @return  void
	 */
	public void setRank(String rank) { //sets rank
		this.rank = rank;
	}
}
