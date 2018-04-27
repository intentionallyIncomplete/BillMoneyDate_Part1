public class Date {

	//class variables
	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year){
		//error handling
		if(day < 1 || day > 31){
			System.out.println("invalid day");
			System.exit(0);
		}else if(month < 1 || month > 12){
			System.out.println("invalid month");
			System.exit(0);
		}else if(year < 2014 || year > 2024){
			System.out.println("invalid year");
			System.exit(0);
		}else{
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}
	
	public String toString(){
		return day + "/" + month + "/" + year;
	}
}