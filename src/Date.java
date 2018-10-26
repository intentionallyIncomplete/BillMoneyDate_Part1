/**
 * @author Ian Bryan
 * @version 10/25/2018
 *
 */
public class Date {

	/**
	 * Class Data Members
	 * day | month | year
	 * All integer values and constrained to general boundaries of the Gregorian calendar.
	 * */
	private int day; 
	private int month; 
	private int year; 

	/**
	 * @param month - {B/ween 1-31}
	 * @param day - {B/ween 1-12}
	 * @param year - {B/ween 2014-2024}
	 * 
	 * Constructor will take in three values of the date, then assign their values to the class data members if the conditions
	 * are satisfied.
	 */
	public Date(int month, int day, int year){

		if(day < 1 || day > 31){
			System.out.println("invalid day: " + day);
			System.exit(0);
		}else if(month < 1 || month > 12){
			System.out.println("invalid month: "+ month);
			System.exit(0);
		}else if(year < 2014 || year > 2024){
			System.out.println("invalid year: " + year);
			System.exit(0);
		}else{
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}

	
	/**
	 * @param other - {Copy constructor takes in object 'other' and replaces current values into the new instance of itself}
	 */
	public Date(Date other){
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	
	/**
	 * @param compareTo
	 * @return boolean - {Always return true if handed date is after the other version by minimum 1 day}
	 */
	public boolean isAfter(Date compareTo){
		if(this.day < ((Date)compareTo).getDay() && this.month < ((Date)compareTo).getMonth()
				&& this.year < ((Date)compareTo).getYear()){
			return false;
		}else if(this.day == ((Date)compareTo).getDay() && this.month == ((Date)compareTo).getMonth()
				&& this.year == ((Date)compareTo).getYear()){
			return false;
		}else {
			return true;
		}
	}

	/**
	 * @param date - {Host for any object. In this case a Date object which 
	 * has its values compared against the previous version of itself.}
	 * */
	public boolean equals(Object date){
		//using the custom toString method on both
		//objects is necessary to be able to compare them
		//in the same format
		if(this.toString().equals(date.toString())){
			//System.out.println("the two dates are the same");
			return true;
		}else{
			//System.out.println("the two dates are not the same");
			return false;
		}
	}

	/**
	 * @return day - {representative of current object value for day}
	 */
	public int getDay(){
		return this.day;
	}

	/**
	 * @return month - {representative of current object value for month}
	 */
	public int getMonth(){
		return this.month;
	}

	/**
	 * @return year - {representative of current object value for year}
	 */
	public int getYear(){
		return this.year;
	}

	
	/**
	 * @param day
	 * Takes in a day value to be assigned, if condition 1<X<31 is satisfied, then assign to the current object's day variable.
	 */
	public void setDay(int day){
		if(day < 1 || day > 31){
			System.out.println("invalid day " + day + "\nProgram Exiting...");
			System.exit(0);
		}else{
			this.day = day;	
		}
	}

	/**
	 * @param month
	 * Takes in a month value, checks if the condition 1 < X < 12 is satisfied. If yes, then assign the value to the current object.
	 */
	public void setMonth(int month){
		if(month < 1 || month > 12){
			System.out.println("invalid month " + month + "\nProgram Exiting...");
			assert(month < 0);
			assert(month != 12);
			System.exit(0);
		}else{
			this.month = month;
		}
	}

	/**
	 * @param year
	 * Takes in a year and checks that is satisfies the condition 2014 < X < 2024
	 */
	public void setYear(int year){
		if(year < 2014 || year > 2024){
			System.out.println("invalid year " + year + "\nProgram Exiting...");
			System.exit(0);
		}else{
			this.year = year;
		}
	}
	
	/**
	 * Basic overriding toString() method that simply puts out the month, day, and year
	 * separated by "/"'s
	 * */
	@Override
	public String toString(){
		return this.month + "/" + this.day + "/" + this.year;
	}
}