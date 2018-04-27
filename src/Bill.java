
public class Bill {

	/****************************************************/
	/* These are objects from the Money and Date class  */
	/* the ctor for this class will be working with the */
	/* assignment of the object's values by the args    */
	/* values passed in through it.						*/
	/****************************************************/
	private Money amount;
	private Date dueDate;
	private Date paidDate;
	private String originator;

	/*****************************************************/
	/* The 'amount' and 'dueDate' values are assigned	 */
	/* to the private objects Money and Date respectively*/
	/* a new Date object is created for the paidDate and */
	/* set to a null value.								 */
	/*****************************************************/
	public Bill(Money amount, Date dueDate, String originator){
		this.amount = amount;
		this.dueDate = dueDate;
		this.paidDate = null;
		this.originator = originator;
	}

	public Bill(Bill toCopy){
		this.amount = toCopy.amount;
		this.dueDate = toCopy.dueDate;
		this.paidDate = toCopy.paidDate;
		this.originator = toCopy.originator;
	}
	
	public Money getAmount(){
		return amount.getMoney();
	}

	public String toString(){
		return "amount: $" + amount.getMoney() + " dueDate: " + dueDate.toString() + 
				" originator: " + originator;
	}
}
