
public class Money {

	//class variables
	private int dollars;
	private double cents;

	//when only being passed int's that
	//represent whole dollars
	public Money(int dollars){
		this.dollars = dollars;
		this.cents = 0;
	}

	//when passed two args, one for whole dollars
	//and the other for cents represented as whole numbers
	public Money(int dollars, int cents){
		this.dollars = dollars;
		this.cents = cents;
	}

	//copy ctor
	public Money(Money other){
		this.dollars = other.dollars;
		this.cents = other.cents;
	}
	
	public boolean equals(Object o){
		if(this == o){
			System.out.println("The amount " + this + " is equal to " + o);
			return true;
		}else{
			System.out.println("The amount " + this + " is not equal to " + o);
			return false;
		}
	}
	
	public void add(int dollars){
		this.dollars += dollars;
	}

	public void add(int dollars, int cents){
		this.dollars += dollars;
		this.cents = cents;
	}
	
	public void add(Money other){
		this.dollars += other.dollars;
		this.cents += other.cents;
	}
	
	public double getMoney(){
		return dollars + ((double)cents/100);
	}
	
	public int getDollars(){
		return dollars;
	}
	
	public int getCents(){
		return (int)cents;
	}
	
	public void setMoney(int dollars, int cents){
		this.dollars = dollars;
		//this.cents = ((double)this.cents/100);
		this.cents = cents;
	}

	//String.format(format, arg) is there to set the returned amount
	//to display as a number with two decimal places
	public String toString(){
		return "$" + String.format("%.2f", getMoney());
	}
}