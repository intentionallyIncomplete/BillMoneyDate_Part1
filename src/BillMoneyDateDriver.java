/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/25/2018
 * 
 * BillMoneyDateDriver{} is an interchangeable unit case test class for JUnit testing. This class only has a static main
 * for executing the functions found in each other class.
 */
public class BillMoneyDateDriver
{
	
	/**
	 * @param args
	 * static main() calls all methods from all classes for testing.
	 */
	public static void main(String[] args)
	{

		/**
		 * Testing the Money Class
		 * money1 | money2 | money3
		 * Testing first constructor with integer for dollar amount |
		 * Testing second constructor with two arguments. One for dollars, one for cents |
		 * Test third constructor with copying values of money1 to money3
		 */
		Money money1 = new Money(5000); //amount paid
		Money money2 = new Money(5648,420); //total bill sum
		//Money money3 = money1;
		
		//Print current values of all three objects
//		System.out.println("-------------Money objects output:------------");
//		System.out.println("Money money1 = new Money(10): " + money1.toString());
//		System.out.println("Money money2 = new Money(10,420): " + money2.toString());
//		System.out.println("Money money3 = money1: " + money3.toString() + "\n----------------------");
		
		//Testing add methods
//		System.out.println("Adding +$10 to money1 object:");
//		money1.add(10);
//		System.out.println("money1.add(10) is now equal to: " + money1.toString());
//		money1.add(money1);
//		System.out.println("money1.add(money1) is now equal to: " + money1.toString());
//		money1.add(10, 420);
//		System.out.println("money1.add(10,420) is now equal to: " + money1.toString());
		
		//Testing setters and getters
//		System.out.println("Current dollar amount for money1: $" + money1.getDollars());
//		System.out.println("Current cent amount for money1: " + money1.getCents());
//		System.out.println("Current amount for money1: " + money1.getMoney());
//		money1.setMoney(10, 420);
//		System.out.println("Set dollar amount to 10 and cent amount to 420. This is essentially resetting the values if done this way");
//		System.out.println("Current amount for money1: " + money1.toString());
//		System.out.println("**Attempting to set values to a negative amount - which should return an error**");
//		money1.setMoney(-10, -420);

		//Testing the equals() method
//		System.out.println("Are money1 and money3 the same?: " + money1.equals(money3));
//		System.out.println("Are money1 and money2 the same?: " + money1.equals(money2));
//		System.out.println("Are money2 and money3 the same?: " + money2.equals(money3));
		
		/**
		 * Testing Date class
		 * date1 | date2 | date3
		 * Testing with first constructor|
		 * Testing with second constructor|
		 * Testing with copy constructor|
		 * */
		Date date1 = new Date(6,6,2017); //paidDate
		Date date2 = new Date(1,1,2020); //dueDate
		//Date date3 = date1;
		
		//Printing current Dates
//		System.out.println("Date date1 = new Date(6,6,2017): " + date1.toString());
//		System.out.println("Date date2 = new Date(1,1,2020): " + date2.toString());
//		System.out.println("Date date3 = date1: " + date3.toString());
//		
//		//Testing the getters and setters
//		System.out.println("Setting date1 to new values of (10,20,2019)");
//		date1.setDay(20);
//		date1.setMonth(10);
//		date1.setYear(2019);
//		System.out.println("Current value of date1 after setting new values through set() methods: " + date1.toString());
//		//System.out.println("Setting date1 to new values of (-10,2000,1) --> This should give us some errors for each one we try to set");
////		date1.setDay(2000); //won't make it to month because program exits after fail in setMonth()
////		date1.setMonth(-10);
////		date1.setYear(1);
//		
//		//Testing equals()
//		System.out.println("Is date1 equal to date2?: " + date1.equals(date2));
//		System.out.println("Is date2 equal to date3?: " + date2.equals(date3));
//		System.out.println("Is date3 equal to date1?: " + date3.equals(date1));
//		
//		//Testing isAfter()
//		System.out.println("Is date1 after date3?: " + date1.isAfter(date3));
//		System.out.println("Is date2 after date3?: " + date2.isAfter(date3));
//		System.out.println("Is date3 after date2?: " + date3.isAfter(date2));
		
		/**
		 * Testing the Bill class
		 * bill1
		 * Testing operations of a Bill
		 * */
		Bill bill1 = new Bill(money1, date2, "University of Washington - Bothell");
		//Printing current Bill
		System.out.println("[[Current Bill Value]]");
		System.out.println(bill1.toString() + "\n[[****End of Bill****]]");
		
		//Setting a due date for the bill
		bill1.setAmount(money2);
		System.out.println("[[Current Bill Value]]");
		System.out.println(bill1.toString() + "\n[[****End of Bill****]]");
		
		System.out.println("Current amount owed: " + bill1.getAmount());
		System.out.println("Current due date of bill: " + bill1.getDueDate());
		
		Bill bill2 = new Bill(money2, date1, "University of Washington - Seattle");
		System.out.println("Same bill?: " + bill1.equals(bill2));
	}
}
