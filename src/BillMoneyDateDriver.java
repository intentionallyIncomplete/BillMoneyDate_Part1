/**
 HW3.java: Simple driver to test Money, Date, and Bill classes
 @author Rob Nash, borrowed from cfolsen
 */
public class BillMoneyDateDriver
{
	/**
     main driver function
     pre:  none
     post: exercises the methods in Bill, Money, and Date (not done)
	 */
	public static void main(String[] args)
	{
		//Construct some money
		//Money money1 = new Money(10);
		//Money money1 = new Money(10,1);
		//Money money1 = new Money(10,99);
		//Money money1 = new Money(10,101);
		//Money money2 = new Money(12);

		//useful for when needed but using two objects to play with seemed to work out alright.
		//Money money3 = new Money(11);

		//money1.setMoney(30,50);

		//print out the two test objects
		//System.out.println("Money objects output:");
		//System.out.println(money1);
		//System.out.println(money2);

		/****************************************************/
		/* Checking the equals() method by setting money1	*/
		/* to an amount, and then money2 to another or the 	*/
		/* same. should print a statement and return		*/
		/* true or false.									*/
		/****************************************************/
		//        System.out.println(money1.equals(money2));
		//        money1.add(5,500);
		//        System.out.println("new money1: " + money1);
		//        money1.add(5,50);
		//        System.out.println("new money1: " + money1);
		//          money1.add(money2);
		//          System.out.println(money1);

		/****************************************************/
		/* Testing the Date class */
		/****************************************************/
		//feed in day --> month --> year
		//print out month --> day --> year
		Date date1 = new Date(1,1,2016);
		Date date2 = new Date(1,1,2016);

		assert(date1 != null);
		assert(date2 != null);

		System.out.println(date1);
		System.out.println(date2);

		//checking the isAfter functionality
		//comments on method functionality in Date class
		//System.out.println(date2.isAfter(date1));

		System.out.println(date2.equals(date1));

		//Construct some bills
		Money amount = new Money(20);
		//day, month, year
		Date dueDate = new Date(30, 4, 2017);
		Bill bill1 = new Bill(amount, dueDate, "The phone company");
		//       
		//        Bill bill2 = new Bill(bill1);
		//        bill2.setDueDate(new Date(5, 30, 2007));
		//        amount.setMoney(31, 99);
		//        dueDate.setDay(29);
		//        Bill bill3 = new Bill(amount, dueDate, "The record company");
		//        
		System.out.println("Bill objects output:");
		System.out.println(bill1);
		//        System.out.println(bill2);
		//        System.out.println(bill3);

	}
}
