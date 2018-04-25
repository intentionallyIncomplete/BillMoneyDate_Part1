
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
	
	public void add(int dollars, int cents){
		centsInDollars = (cents/100);
		centsRemaining = cents%100;
		newDollars = centsInDollars + centsRemaining;
	}

	public void setMoney(int dollars, int cents){
			this.dollars = dollars;
			this.cents = this.cents;
			
	}
	public double getMoney(){
		return newDollars;
	}
	
	public double getDollars(){
		return dollars;
	}
	
	public int getCents(){
		return cents;
	}
	
	public String toString(){
		return "$" + String.format("%.2f", this.getMoney();
	}
}
