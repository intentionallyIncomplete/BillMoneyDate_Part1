
public class Money {
	
	//class variables
	private int dollars;
	private int cents;
	private double newDollars;
	private double centsInDollars;
	private int centsRemaining;
	
	public Money(int dols){
		this.dollars = dols;
		this.cents = 0;
	}
	
	public Money(int dols, int cents){
		this.dollars = dols;
		this.cents = cents;
		getMoney();
	}
	
	public Money(Money other){
		this.dollars = other.dollars;
		this.cents = other.cents;
	}
	
	public double add(int dollars, int cents){
		//da fuck do i do here
	}

	public void setMoney(int dollars, int cents){
		//dunno
	}
	public double getMoney(){
		//return a double
	}
	
	public double getDollars(){
		return dollars;
	}
	
	public int getCents(){
		return cents;
	}
	
	public String toString(){
		return "$" + this.getMoney();
	}
}
