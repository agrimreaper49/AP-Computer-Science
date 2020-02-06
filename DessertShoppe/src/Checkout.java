import java.util.ArrayList;

public class Checkout {
	private final double taxRate = .06;
	private ArrayList <DessertItem> items = new ArrayList <DessertItem>();
	private double cashRegister;
	
	
	Sundae sun = new Sundae ("Sundae" , 0.50);
	IceCream ice = new IceCream (0.25 , "IceCream");
	Cookie cookie = new Cookie ("Cookie" , 5 , 0.50);
	Candy candy = new Candy("Candy" , 0.50 , 2);
	
	public static void main (String [] args) {
	}
	
	public double enterItemsGetRegister() {
		items.add(sun);
		items.add(ice);
		items.add(cookie);
		items.add(candy);
		for ( int i = 0; i < items.size(); i++ ) {
			cashRegister += items.get(i).getCost();
		}
		System.out.println(cashRegister);
		return cashRegister;
	}
	public void clearRegister() {
		cashRegister = 0;
		items.clear();
	}
	public double getCostBeforeTax(){
		double total = enterItemsGetRegister();
		return total;
	}
	public double getTotalCostAfterTax() {
		double total = 0;
		total += enterItemsGetRegister() * this.taxRate;
		return total;
	}
	public String toString() {
		return "The Dessert Shoppe\n------------------" + 
	cookie.returnNumber() + "@" + cookie.pricePerDozen() + "/lb" + "\n" + 
				cookie.returnName() + candy.getWeight() + "lbs" + "@" + candy.getPricePerPound() + "/lb" +
				"/lb" + "\n" + candy.returnName() + "\n" + ice.getCost() + "\n"  + ice.returnName() + "\n" +
				sun.getCost() + "\n" + ) ;
	}


}