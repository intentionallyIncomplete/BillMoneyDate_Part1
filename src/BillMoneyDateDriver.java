
/**
 * Class Description:
 * @author Ian Bryan
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

		/*
		 * Testing the Money Class
		 * Money1 | Money2 | Money3
		 * Testing first constructor with integer for dollar amount |
		 * Testing second constructor with two arguments. One for dollars, one for cents |
		 * Test third constructor with copying values of money1 to money3
		 */
		Money money1 = new Money(10);
		Money money2 = new Money(10,420);
		Money money3 = money1;
		//Print current values of all three objects
		System.out.println("-------------Money objects output:------------");
		System.out.println("Money money1 = new Money(10): " + money1.toString());
		System.out.println("Money money2 = new Money(10,420): " + money2.toString());
		System.out.println("Money money3 = money1: " + money3.toString() + "\n----------------------");
		//Testing add methods
		System.out.println("Adding +$10 to money1 object:");
		money1.add(10);
		System.out.println("money1.add(10) is now equal to: " + money1.toString());
		money1.add(money1);
		System.out.println("money1.add(money1) is now equal to: " + money1.toString());
		money1.add(10, 420);
		System.out.println("money1.add(10,420) is now equal to: " + money1.toString());

		/****************************************************/
		/* Testing the Date class */
		/****************************************************/
//		Date date1 = new Date(1,1,2016);
//		Date date2 = new Date(1,1,2016);
//
//		assert(date1 != null);
//		assert(date2 != null);
//
//		System.out.println(date1);
//		System.out.println(date2);
//
//		//checking the isAfter functionality
//		//comments on method functionality in Date class
//		//System.out.println(date2.isAfter(date1));
//
//		//System.out.println(date2.equals(date1));
//
//		//testing the set methods for invariants
//		//date1.setDay(32);
//		//date1.setMonth(13);
//		//date1.setYear(1995);
//
//		/*****************************************************/
//		/* Testing the Bill class							 */
//		/*****************************************************/
//		//Construct some bills
//		Money amount = new Money(50);
//		Date dueDate = new Date(4, 30, 2017);
//		Date datePaid = new Date(5, 15, 2017);
//
//		//instantiating a new object bill1 with values
//		//from the Money object 'amount' and the Date object
//		//'dueDate'. Then copy it using the copy ctor in
//		//the Bill class.
//		Bill bill1 = new Bill(amount, dueDate, "The phone company");
//		Bill bill2 = new Bill(bill1);
//
//		System.out.println("----------Bill 1------------");
//		System.out.println(bill1);
//		System.out.println("----------Bill 2------------");
//		System.out.println(bill2);
//		
//		//checking the equals method
//		//will be reused a few times to 
//		//keep track of the bills.
//		System.out.println("---------------------------");
//		System.out.println("Bill has been not updated?: " + bill1.equals(bill2));
//
//		//using the setDueDate method that resets the
//		//dueDate value on the conditions of the isPaid
//		//method in the Bill class.
//		bill1.setDueDate(new Date(5, 30, 2017));
//		System.out.println("----------Bill 1------------");
//		System.out.println(bill1);
//		System.out.println("---------------------------");
//		System.out.println("Bill has been not updated?: " + bill1.equals(bill2));
//		
//		//checking the setPaid method
//		//and setting the amount to 0 to show this.
//		Money newAmount = new Money(0);
//		bill1.setAmount(newAmount);
//		bill1.setPaid(datePaid);
//		System.out.println("----------Bill 1------------");
//		System.out.println(bill1);
	}
}
