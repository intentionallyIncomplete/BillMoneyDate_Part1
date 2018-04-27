
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

	/*****************************************************/
	/* This is the copy ctor for the Bill class. It will */
	/* basically this just sets the current value of the */
	/* objects to a copy of the object, value by value	 */
	/*****************************************************/
	public Bill(Bill toCopy){
		this.amount = toCopy.amount;
		this.dueDate = toCopy.dueDate;
		this.paidDate = toCopy.paidDate;
		this.originator = toCopy.originator;
	}
	
	/****************************************************/
	/* This method will check if the datePaid value		*/
	/* is after the dueDate value. This method will call*/
	/* the isAfter method from the Date class to check. */
	/****************************************************/
//	public boolean isPaid(){
//		if()
//	}
	/****************************************************/
	/* Begin getters*/
	/****************************************************/
	public Money getAmount(){
		return amount;
	}
	
	public Date getDueDate(){
		return dueDate;
	}
	
	public String getOriginator(){
		return originator;
	}
	/****************************************************/
	/* End getters, begin setters */
	/****************************************************/
	
	public boolean setPaid(Date datePaid){
		if(datePaid.isAfter(dueDate)){
			return false;
		}else{
			paidDate = datePaid;
			return true;
		}
	}

	public String toString(){
		return "amount: $" + amount.getMoney() + " dueDate: " + dueDate.toString() + 
				" originator: " + originator;
	}
}
