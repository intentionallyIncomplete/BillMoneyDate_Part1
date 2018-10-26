/**
 * Class Description:
 * @author Ian Bryan
 * @version 10/25/2018
 * 
 * Bill stores both Money and Date objects to use when deciding bill amounts to produce.
 * */
public class Bill {

	/**
	 * Class Data Members
	 * Money - some value represented in dollars and cents
	 * Date - {dueDate},{paidDate} - some dates that are used when determining if the pill is outstanding.
	 * Originator - string value representation of the company/person to pay
	 */
	private Money amount;
	private Date dueDate;
	private Date paidDate;
	private String originator;


	/**
	 * @param amount
	 * @param dueDate
	 * @param originator
	 * 
	 * A value and date are assigned to a Bill along with the name of the entity to pay out to.
	 */
	public Bill(Money amount, Date dueDate, String originator){
		this.amount = amount;
		this.dueDate = dueDate;
		this.paidDate = null;
		this.originator = originator;
	}


	/**
	 * @param toCopy
	 * Assuming all other classes have copy constructors, this is the same principle of copying.
	 */
	public Bill(Bill toCopy){
		this.amount = toCopy.amount;
		this.dueDate = toCopy.dueDate;
		this.paidDate = toCopy.paidDate;
		this.originator = toCopy.originator;
	}


	/**
	 * @return boolean - {If the value of the value of Money (amount) is 0, then the bill is paid}
	 */
	public boolean isPaid(){
		if(this.amount.getMoney() == 0){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * @return boolean - {Using the toString override to set each object as a String value for comparison}
	 * */
	public boolean equals(Object toCompare){
		if(this.toString().equals(toCompare)){
			return true;
		}else{
			return false;
		}
	}

	/**@return Money*/
	public Money getAmount(){return this.amount;}

	/**@return Date*/
	public Date getDueDate(){return this.dueDate;}

	/**@return originator - {Entity in string format of who to pay to or who is doing the billing}*/
	public String getOriginator(){return originator;}

	/**
	 * @param datePaid
	 * @return boolean - {Depends on condition}
	 * Will use the isAfter method from the Date class to compare the dueDate object value to the datePaid object's value.
	 */
	public boolean setPaid(Date datePaid){
		if(datePaid.isAfter(dueDate)){
			return false;
		}else{
			this.paidDate = datePaid;
			return true;
		}
	}

	/**
	 * @param nextDate
	 * @return boolean - {Depends on condition}
	 * This boolean method will check for the next provided date value.
	 * If isPaid returns true, then everything else is irrelevent since the bill is paid.
	 * If isPaid returns false, set dueDate to the handed nextDate for evaluation by Date.
	 */
	public boolean setDueDate(Date nextDate){
		if(isPaid()){
			return false;
		}else{
			this.dueDate = nextDate;
			return true;
		}
	}

	/**
	 * @param amount
	 * @return
	 * Take in a new Money object that has a value. 
	 * Condition is checked for if handed value is 0 - bill is paid,
	 * else amount is set to the last Money value in memory
	 */
	public boolean setAmount(Money amount){
		if(isPaid()){
			return false;
		}else{
			this.amount = amount;
			return true;
		}
	}

	/**
	 * @param originator
	 * simple setter
	 */
	public void setOriginator(String originator){
		this.originator = originator;
	}

	/**
	 * The return String is different depending on the condition of isPaid. 
	 * When true, it will print the first String, else it will print the other.
	 */
	@Override
	public String toString(){
		if(isPaid()){
			assert(paidDate != null);
			return "Amount Due: " + this.amount + "\nCurrent Due Date: "
					+ this.dueDate.toString() + "\nOrigin of Bill: " + this.originator
					+ "\nDate Paid: " + this.paidDate;
		}else{
			return "Amount Due: " + this.amount + "\nCurrent Due Date: "
					+ this.dueDate.toString() + "\nOrigin of Bill: " + this.originator;
		}
	}
}