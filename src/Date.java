public class Date {

	//class variables
	private int day;
	private int month;
	private int year;

	/*****************************************************/
	/* This ctor will check for a few invariants		 */
	/* The days have to be 1 < days < 31 while the months*/
	/* must be 1 < months < 12 and the year between 	 */
	/* 2014 and 2024. The class variables will only be 	 */
	/* set if all these conditions are met true.		 */
	/*****************************************************/
	public Date(int day, int month, int year){

		if(day < 1 || day > 31){
			System.out.println("invalid day: " + day);
			assert(day > 0);
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

	//copy ctor
	public Date(Date other){
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	/*****************************************************/
	/* the isAfter method will return false under any	 */
	/* condition unless the day of the handed date is GT */
	/* the current one by as little as 1 day			 */
	/*****************************************************/
	public boolean isAfter(Date compareToDate){
		if(compareToDate.day > day && compareToDate.month >= month
				&& compareToDate.year >= year){
			return true;
		}else{
			return false;
		}
	}

	//checking for equivalence
	public boolean equals(Object date){
		//using the custom toString method on both
		//objects is necessary to be able to compare them
		//in the same format
		if(this.toString().equals(date.toString())){
			System.out.println("the two dates are the same");
			return true;
		}else{
			System.out.println("the two dates are not the same");
			return false;
		}
	}

	/*****************/
	/* Begin getters */
	/*****************/

	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}

	/****************************/
	/* End getters, begin setters*/
	/****************************/

	public void setDay(int day){
		this.day = day;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public void setYear(int year){
		this.year = year;
	}

	/**************/
	/* end setters*/
	/**************/

	public String toString(){
		return month + "/" + day + "/" + year;
	}
}