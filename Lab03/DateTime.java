
public class DateTime {
	/**
	 * @author Ethan Gutknecht
	 */
	
	
	// Declare variables or properties
		public int second, minute, hour, day, year;
		public String month;

		
		
	/**
	 * @return Returns true if both DateTime objects have the same second, minute, 
	 * hour, day, month and year, otherwise it should return false.
	 */
	public boolean equals(DateTime anotherDateTime) {
		boolean returnValue = true;
		if (anotherDateTime.second != second) returnValue = false; //if any one of these don't equal return value changes
		if (anotherDateTime.minute != minute) returnValue = false;
		if (anotherDateTime.hour != hour) returnValue = false;
		if (anotherDateTime.day != day) returnValue = false;
		if (anotherDateTime.year != year) returnValue = false;
		if (!anotherDateTime.month.equals(month)) returnValue = false;
		return returnValue;
	}
	
	
	
	/**
	 * @return String: text format of a date and time based on user input.
	 */
	public String toString() {
		String returnString = ""; //format: 00:00:00 00 Month 0000
		
		returnString += hour + ":" + minute + ":"
		+ second + " " + day + " " + month + " " + year;
		
		return returnString;
	}
}
