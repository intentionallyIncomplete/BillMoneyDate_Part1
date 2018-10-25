/**
 * @author Ian Bryan
 * @version 10/25/2018
 * 
 * Money represents a dollar and cent amount separately to be used together, as a Money object, for adding to or removing from Bills.
 */
public class Money {
	/**
	 * Class Data Members:
	 * int dollars - Whole dollar values (assume United States currency)
	 * double cents - Fractional representation of a whole int (dollar).
	 */
	private int dollars;
	@SuppressWarnings("javadoc")
	private double cents;

	/**
	 * @param dollars
	 * Whole dollar amount given to program
	 */
	public Money(int dollars){
		this.dollars = dollars;
		this.cents = 0;
	}

	
	/**
	 * @param dollars
	 * @param cents
	 * Using class level variables to assign their initial values to values obtained from the program.
	 * Cent conversion happens later (may change to being done within this constructor)
	 */
	public Money(int dollars, int cents){
		this.dollars = dollars;
		this.cents = cents;
	}

	
	/**
	 * @param other
	 * Deep copy constructor. Copies current values of Money to instance of itself to prevent overriding of final data.
	 */
	public Money(Money other){
		this.dollars = other.dollars;
		this.cents = other.cents;
	}
	
	/*
	 * equals() method checks for if the passed in object
	 * has undergone changes.
	 * */
	public boolean equals(Object o){
		if(this == o){
			System.out.println("The amount " + this + " is equal to " + o);
			return true;
		}else{
			System.out.println("The amount " + this + " is not equal to " + o);
			return false;
		}
	}

	/**
	 * @param dollars
	 * Simply takes in a whole dollar amount to add to the current sum of dollars.
	 */
	public void add(int dollars){
		this.dollars += dollars;
	}

	
	/**
	 * @param dollars
	 * @param cents
	 * Overloaded method takes in dollars AND cents if the condition of the method signature is satisfied by the arguments of the call.
	 */
	public void add(int dollars, int cents){
		this.dollars += dollars;
		this.cents = cents;
	}
	
	//will add the handed Money object's value
	//to the count of the current object's value
	//individually for dollars and cents.
	public void add(Money other){
		this.dollars += other.dollars;
		this.cents += other.cents;
	}
	
	/**
	 * @return the value, as a double, of sum of the dollar total and the total cents divided by 100 total cents per dollar.
	 * @since $1 = 100 cents, dividing by 100 into the total cents 
	 * returns the number of fractional cents remaining to add to the grand total.
	 */
	public double getMoney(){
		return dollars + ((double)cents/100);
	}
	
	/**
	 * @return
	 */
	public int getDollars(){
		return this.dollars;
	}
	
	/**
	 * @return
	 */
	public int getCents(){
		return (int)this.cents;
	}

	/**
	 * @param dollars
	 * @param cents
	 * Setter for any instance of Money that requires an update to the values of dollar or cents.
	 */
	public void setMoney(int dollars, int cents){
		this.dollars = dollars;
		this.cents = cents;
	}

	//String.format(format, arg) is there to set the returned amount
	//to display as a number with two decimal places
	public String toString(){
		return "$" + String.format("%.2f", getMoney());
	}
}